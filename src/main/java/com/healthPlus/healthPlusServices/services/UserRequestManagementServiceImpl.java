package com.healthPlus.healthPlusServices.services;

import com.healthPlus.healthPlusServices.model.entity.Users;
import com.healthPlus.healthPlusServices.model.user.request.CreateUserRequestDTO;
import com.healthPlus.healthPlusServices.repository.UsersRepository;
import com.healthPlus.healthPlusServices.services.contracts.UserRequestManagementService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserRequestManagementServiceImpl implements UserRequestManagementService {

    @Autowired
     UsersRepository usersRepository;

    @Override
    public void
    createUser(Users requestDTO) {
        usersRepository.save(requestDTO);
    }
}
