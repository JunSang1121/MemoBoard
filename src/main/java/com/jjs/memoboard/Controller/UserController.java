package com.jjs.memoboard.Controller;


import com.jjs.memoboard.Dto.UserDto;
import com.jjs.memoboard.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UserController {


    private final UserService userService;

    @GetMapping("/users")
    public ResponseEntity<UserDto.Response> findUserProfile(@RequestParam Long userId){
         UserDto.Response userResponseDto = userService.findUserProfile(userId);
         return ResponseEntity.ok(userResponseDto);
    }

    @PostMapping("/users")
    public ResponseEntity<UserDto.saveUserInfoResponse> saveUser(@RequestBody UserDto.saveRequest requestDto){
        UserDto.saveUserInfoResponse response = userService.saveUserInfo(requestDto);
        return ResponseEntity.ok(response);
    }
}
