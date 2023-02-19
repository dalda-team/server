package com.dalda.dalda_server.response;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommentResponse {
    private Long id;
    private UserResponse writer;
    private UserResponse mentionUser;
    private String content;
    private List<String> tags;
    private Long subCommentsCount;
    private Long likes;
    private String createdAt;
    private String updatedAt;
    private Boolean isModified;
}
