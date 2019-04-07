package com.repository;

import com.shema.Grades;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * GradesRepository provides the necessary search operations
 */

public interface GradesRepository extends JpaRepository<Grades, Long> {

}
