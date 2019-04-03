package com.repository;

import com.shema.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

//   @Query("SELECT u FROM User u WHERE LOWER(u.name) LIKE LOWER(CONCAT('%',:name))")
//    List<User> findByNameStartsWithParam1(@Param("name") String name);
//
//    @Query("SELECT u FROM User u WHERE LOWER(u.name) LIKE LOWER(CONCAT('%',?1))")
//    List<User> findByNameStartsWithParam2(String name);

//    List<User> findByNameStartsWith(String name);
//
//    //Stream<User> findByNameStartsWith(String name);
//
  // User findByName(String first_name);

 //   Optional<User> findByName(String first_name);
}
