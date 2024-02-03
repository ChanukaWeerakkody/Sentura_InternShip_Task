package com.ijse.internship.demo.api;

import com.ijse.internship.demo.dto.UserDTO;
import com.ijse.internship.demo.service.UserService;
import com.ijse.internship.demo.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil addUser(@RequestBody UserDTO userDTO) {
        userService.saveUser(userDTO);
        return new ResponseUtil(200, "Registration Successfully....", userDTO);
    }

    @PutMapping()
    public ResponseUtil updateUser(@RequestBody UserDTO dto){
        userService.updateUser(dto);
        return new ResponseUtil(200,"Success!"+": Updated.!",null);
    }

    @DeleteMapping(params = {"userId"},produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteUser(@RequestParam Long userId){
        userService.deleteUser(userId);
        return new ResponseUtil(200,"Success",userId);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllUsers(){
        return new ResponseUtil(200,"Success",userService.getAllUserDetail());
    }

}
