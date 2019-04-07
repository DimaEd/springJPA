package com.repository;

import com.shema.Sin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * SinRepository provides the necessary search operations
 */

public interface SinRepository extends JpaRepository<Sin, Long> {

}
