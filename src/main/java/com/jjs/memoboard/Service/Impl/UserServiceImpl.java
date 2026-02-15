package com.jjs.memoboard.Service.Impl;


import com.jjs.memoboard.Domain.User;
import com.jjs.memoboard.Dto.UserDto;
import com.jjs.memoboard.Repository.UserRepository;
import com.jjs.memoboard.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
public class
UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Transactional(readOnly = true)
    @Override
    public User findUser(Long userId){
        return userRepository.findById(userId).orElseThrow(() ->new RuntimeException(" 사용자를 찾을 수 없음: " + userId));
    }

    @Transactional
    @Override
    public UserDto.Response findUserProfile(Long userId){
        User user = findUser(userId);
        UserDto.Response userDto = new UserDto.Response(user);
        return userDto;
    }

    @Transactional
    @Override
    public UserDto.saveUserInfoResponse saveUserInfo(UserDto.saveRequest userInfo){

        User user = User.builder()
                .name(userInfo.getName())
                .email(userInfo.getEmail())
                .build();

        User savedUser = userRepository.save(user);

        UserDto.Response userResponseDto = new UserDto.Response(savedUser);

        return UserDto.saveUserInfoResponse.builder()
                .userResponseDto(userResponseDto)
                .build();
    }
}
