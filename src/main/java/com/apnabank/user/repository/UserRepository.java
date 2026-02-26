package com.apnabank.user.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.apnabank.user.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
