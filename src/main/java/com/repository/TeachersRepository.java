package com.repository;

import com.shema.Teachers;
import com.shema.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * TeachersRepository provides the necessary search operations
 */
public interface TeachersRepository extends JpaRepository<Teachers, Long> {

}
