package com.repository;

import com.shema.Schoolboy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SchoolboyRepository extends JpaRepository<Schoolboy, Long> {
//    List<Schoolboy> findByNameStartsWithParam2(String name);
//
//    List<Schoolboy> findByNameStartsWith(String name);
//
//    //Stream<User> findByNameStartsWith(String name);
//
//    Schoolboy findByName(String name);
}
