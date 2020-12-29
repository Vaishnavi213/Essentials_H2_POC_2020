package com.BackEnd.UserList.repository;

import com.BackEnd.UserList.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
