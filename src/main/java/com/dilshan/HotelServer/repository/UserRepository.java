package com.dilshan.HotelServer.repository;


import com.dilshan.HotelServer.entity.User;
import com.dilshan.HotelServer.enums.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findFirstByEmail(String email);
    Optional<User> findByUserRole(UserRole userRole);
}
