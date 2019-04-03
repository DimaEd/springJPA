package com.repository;

import com.shema.Disciplines;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DictiplinesRepository extends JpaRepository<Disciplines, Long> {
//    List<Disciplines> findByNameStartsWithParam2(String name);
//
//    List<Disciplines> findByNameStartsWith(String name);
//
//    //Stream<User> findByNameStartsWith(String name);
//
//    Disciplines findByName(String name);
}
