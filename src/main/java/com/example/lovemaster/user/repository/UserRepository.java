package com.example.lovemaster.user.repository;
import com.example.lovemaster.user.domain.User;
import com.example.lovemaster.user.dto.CreateUserDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
