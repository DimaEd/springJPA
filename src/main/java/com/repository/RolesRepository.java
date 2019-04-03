package com.repository;

import com.shema.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RolesRepository extends JpaRepository<Roles, Long> {
//    List<Roles> findByNameStartsWithParam2(String name);
//
//    List<Roles> findByNameStartsWith(String name);
//
//    //Stream<User> findByNameStartsWith(String name);
//
//    Roles findByName(String name);
}
