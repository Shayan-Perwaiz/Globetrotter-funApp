package com.example.demoGlobetrotter.Repository;

import com.example.demoGlobetrotter.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
    User findByInviteCode(String inviteCode);
}
