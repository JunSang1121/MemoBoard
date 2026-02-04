package com.jjs.memoboard.Service;

import com.jjs.memoboard.Domain.User;
import com.jjs.memoboard.Dto.UserDto;

public interface UserService {

    User findUser(Long userId);


    UserDto.Response findUserProfile(Long userId);
    UserDto.saveUserInfoResponse saveUserInfo(UserDto.saveRequest userInfo);
}
