package com.User.CRUDuser.UserRepository;

import com.User.CRUDuser.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userrepository extends JpaRepository<User,Integer> {
}
