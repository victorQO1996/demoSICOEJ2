package com.example.demo.repository;

import com.example.demo.entity.Evento;
import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Serializable> {
    public abstract User findUserById(int id);
    public abstract User findUserByUser(String Usuario);
}
