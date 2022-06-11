package com.healthPlus.healthPlusServices.repository;

import com.healthPlus.healthPlusServices.model.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users,Integer> {
}
