package com.jjs.memoboard.Service;

import com.jjs.memoboard.Domain.User;
import com.jjs.memoboard.Dto.UserResponseDto;

public interface UserService {

    User findUser(Long userId);


    UserResponseDto.Response findUserProfile(Long userId);
}
