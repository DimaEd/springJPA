package com.repository;

import com.shema.Classes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClassesRepository extends JpaRepository<Classes, Long> {
//    List<Classes> findByNameStartsWithParam2(String name);
//
//    List<Classes> findByNameStartsWith(String name);
//
//    //Stream<User> findByNameStartsWith(String name);
//
//    Classes findByName(String name);
}
