package com.repository;

import com.shema.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * RolesRepository provides the necessary search operations
 */

public interface RolesRepository extends JpaRepository<Roles, Long> {

}
