package com.healthPlus.healthPlusServices.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Users {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "emailId")
    private String emailId;

    @Column(name = "password")
    private String password;

    @Column(name = "dateOfBirth")
    private String dob;

    @Column(name = "phoneNumber")
    private String phoneNumber;

}
