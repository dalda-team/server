package com.dalda.dalda_server.web.response;

import com.dalda.dalda_server.config.auth.dto.SessionUser;
import com.dalda.dalda_server.domain.user.Users;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(Include.NON_NULL)
public class UserResponse {
    private String handle;
    private String username;

    public UserResponse(Users users) {
        this.handle = users.getHandle();
        this.username = users.getName();
    }

    public UserResponse(SessionUser sessionUser) {
        this.handle = sessionUser.getHandle();
        this.username = sessionUser.getName();
    }
}
