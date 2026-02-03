package com.jjs.memoboard.Dto;

import com.jjs.memoboard.Domain.User;
import lombok.Getter;
import lombok.NoArgsConstructor;


public class UserResponseDto {

    @Getter
    @NoArgsConstructor
    public static class Response{

        private Long userId;
        private String name;
        private String email;

        public Response(User Entity){
            this.userId = Entity.getId();
            this.name = Entity.getName();
            this.email = Entity.getEmail();
        }
    }
}
