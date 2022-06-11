package com.healthPlus.healthPlusServices.model.user;

import lombok.Data;

@Data
public class Address {
    private String line1;
    private String line2;
    private String country;
    private String pinCode;
    private String state;
}
