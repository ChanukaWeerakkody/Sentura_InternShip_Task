package com.ijse.internship.demo.service;

import com.ijse.internship.demo.dto.UserDTO;

import java.util.List;

public interface UserService {
    void saveUser(UserDTO dto);
    void updateUser(UserDTO dto);
    void deleteUser(Long id);
    UserDTO searchUserById(String userId);
    List<UserDTO> getAllUserDetail();
}
