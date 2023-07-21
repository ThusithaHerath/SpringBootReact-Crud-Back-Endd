package com.thusi.pos.repository;

import com.thusi.pos.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
