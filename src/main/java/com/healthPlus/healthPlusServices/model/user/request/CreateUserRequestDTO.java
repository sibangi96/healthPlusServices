package com.healthPlus.healthPlusServices.model.user.request;

import com.healthPlus.healthPlusServices.model.user.Address;
import lombok.Data;

@Data
public class CreateUserRequestDTO {

    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String dob;
    private String phoneNum;
    private Address address;

}
