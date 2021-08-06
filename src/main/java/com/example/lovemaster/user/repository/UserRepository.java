package com.example.lovemaster.user.repository;
import com.example.lovemaster.user.domain.User;
import com.example.lovemaster.user.dto.CreateUserDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User,Long> {
    @Query("select m from User m where userId = :id and userPw = :pw")
    User finduser(String id, String pw);
}
