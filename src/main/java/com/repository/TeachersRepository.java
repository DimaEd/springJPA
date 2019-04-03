package com.repository;

import com.shema.Teachers;
import com.shema.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeachersRepository extends JpaRepository<Teachers, Long> {
//    List<Teachers> findByNameStartsWithParam2(String name);
//
//    List<Teachers> findByNameStartsWith(String name);
//
//    //Stream<User> findByNameStartsWith(String name);
//
//    Teachers findByName(String name);
}
