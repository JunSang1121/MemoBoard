package com.jjs.memoboard.Service.Impl;


import com.jjs.memoboard.Domain.User;
import com.jjs.memoboard.Dto.UserResponseDto;
import com.jjs.memoboard.Repository.UserRepository;
import com.jjs.memoboard.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Transactional(readOnly = true)
    @Override
    public User findUser(Long userId){
        return userRepository.findById(userId).orElseThrow(() ->new RuntimeException(" 사용자를 찾을 수 없음: " + userId));
    }

    @Transactional
    @Override
    public UserResponseDto.Response findUserProfile(Long userId){
        User user = findUser(userId);
        UserResponseDto.Response userDto = new UserResponseDto.Response(user);
        return userDto;
    }
}
