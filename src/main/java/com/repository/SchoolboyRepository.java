package com.repository;

import com.shema.Schoolboy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * SchoolboyRepository provides the necessary search operations
 */
public interface SchoolboyRepository extends JpaRepository<Schoolboy, Long> {

}
