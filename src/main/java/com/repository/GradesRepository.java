package com.repository;

import com.shema.Grades;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GradesRepository extends JpaRepository<Grades, Long> {
//    List<Grades> findByNameStartsWithParam2(String name);
//
//    List<Grades> findByNameStartsWith(String name);
//
//    //Stream<User> findByNameStartsWith(String name);
//
//    Grades findByName(String name);
}
