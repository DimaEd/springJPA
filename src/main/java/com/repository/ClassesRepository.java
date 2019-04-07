package com.repository;

import com.shema.Classes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * ClassesRepository provides the necessary search operations
 */

public interface ClassesRepository extends JpaRepository<Classes, Long> {

}
