package com.healthPlus.healthPlusServices.controller;

import com.healthPlus.healthPlusServices.model.entity.Users;
import com.healthPlus.healthPlusServices.model.user.request.CreateUserRequestDTO;
import com.healthPlus.healthPlusServices.services.contracts.UserRequestManagementService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserServiceController {

    @Autowired
    UserRequestManagementService userRequestManagementService;


    @RequestMapping(value="/v1.0/user/create", method = RequestMethod.POST)
    public void createUser(@RequestBody Users requestDTO){
        userRequestManagementService.createUser(requestDTO);
    }
}
