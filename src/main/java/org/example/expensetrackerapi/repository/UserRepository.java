package org.example.expensetrackerapi.repository;

import org.example.expensetrackerapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
