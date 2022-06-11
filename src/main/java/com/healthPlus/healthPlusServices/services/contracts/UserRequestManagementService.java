package com.healthPlus.healthPlusServices.services.contracts;

import com.healthPlus.healthPlusServices.model.entity.Users;
import com.healthPlus.healthPlusServices.model.user.request.CreateUserRequestDTO;

public interface UserRequestManagementService {

     void createUser(Users requestDTO);
}
