package com.ijse.internship.demo.service.impl;

import com.ijse.internship.demo.dto.UserDTO;
import com.ijse.internship.demo.entity.User;
import com.ijse.internship.demo.repo.UserRepo;
import com.ijse.internship.demo.service.UserService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Autowired
    UserRepo repo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void saveUser(UserDTO dto) {
        repo.save(mapper.map(dto, User.class));
    }

    @Override
    public void updateUser(UserDTO dto) {
        repo.save(mapper.map(dto, User.class));
    }

    @Override
    public void deleteUser(Long id) {
        repo.deleteById(id);
    }

    @Override
    public UserDTO searchUserById(String userId) {
        return null;
    }

    @Override
    public List<UserDTO> getAllUserDetail() {
        return mapper.map(repo.findAll(), new TypeToken<List<UserDTO>>() {}.getType());
    }
}
