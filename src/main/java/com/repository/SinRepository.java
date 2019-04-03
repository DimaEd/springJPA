package com.repository;

import com.shema.Sin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SinRepository extends JpaRepository<Sin, Long> {
//    List<Sin> findByNameStartsWithParam2(String name);
//
//    List<Sin> findByNameStartsWith(String name);
//
//    //Stream<User> findByNameStartsWith(String name);
//
//    Sin findByName(String name);
}
