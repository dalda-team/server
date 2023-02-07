package com.dalda.dalda_server.web.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(Include.NON_NULL)
public class CommentsResponse {
    private Long page;
    private Long size;
    private Boolean isEnded;
    private List<CommentResponse> comments;
}