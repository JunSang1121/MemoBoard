package com.jjs.memoboard.Controller;


import com.jjs.memoboard.Dto.UserResponseDto;
import com.jjs.memoboard.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {


    private final UserService userService;

    public ResponseEntity<UserResponseDto.Response> findUserProfile(Long userId){
         UserResponseDto.Response userResponseDto = userService.findUserProfile(userId);
         return ResponseEntity.ok(userResponseDto);
    }
}
