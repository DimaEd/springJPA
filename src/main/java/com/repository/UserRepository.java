package com.repository;

import com.shema.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

/**
 * UserRepository provides the necessary search operations
 */

public interface UserRepository extends JpaRepository<User, Long> {

    User findByRolesId(Long id);

}
