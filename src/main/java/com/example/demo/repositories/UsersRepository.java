package com.example.demo.repositories;

import com.example.demo.domain.users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository <users, Long>{
}
