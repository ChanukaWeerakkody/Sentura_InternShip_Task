package com.ijse.internship.demo.service.impl;

import com.ijse.internship.demo.dto.UserDTO;
import com.ijse.internship.demo.repo.UserRepo;
import com.ijse.internship.demo.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Autowired
    UserRepo repo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void saveUser(UserDTO dto) {

    }

    @Override
    public void updateUser(UserDTO dto) {

    }

    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public UserDTO searchUserById(String userId) {
        return null;
    }

    @Override
    public List<UserDTO> getAllUserDetail() {
        return null;
    }
}
