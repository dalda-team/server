package com.dalda.dalda_server.web;

import com.dalda.dalda_server.config.auth.dto.LoginUserRequest;
import com.dalda.dalda_server.config.auth.dto.annotation.LoginUser;
import com.dalda.dalda_server.web.response.UserResponse;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final HttpServletResponse httpServletResponse;

    @GetMapping("/logout-success")
    public String logout(HttpSession httpSession) {
        httpSession.invalidate();
        return "Successful logout";
    }

    @PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    @GetMapping("/users/myinfo")
    public UserResponse myinfo(@LoginUser LoginUserRequest loginUserRequest) {
        if (loginUserRequest.isLogin()) {
            return new UserResponse(loginUserRequest.getUser());
        }
        else {
            httpServletResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            return null;
        }
    }
}
