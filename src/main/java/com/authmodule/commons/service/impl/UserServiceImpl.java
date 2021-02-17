package com.authmodule.commons.service.impl;

import com.authmodule.commons.model.Users;
import com.authmodule.commons.repository.UserRepository;
import com.authmodule.commons.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Users createUser(Users users) {
        return userRepository.save(users);
    }
}
