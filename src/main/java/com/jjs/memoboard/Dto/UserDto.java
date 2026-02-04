package com.jjs.memoboard.Dto;

import com.jjs.memoboard.Domain.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


public class UserDto {

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

    @Getter
    @NoArgsConstructor
    public static class saveRequest{

        private String name;
        private String email;
    }


    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class saveUserInfoResponse{
        private UserDto.Response userResponseDto;
    }

}
