package com.repository;

import com.shema.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
//    List<Schedule> findByNameStartsWithParam2(String name);
//
//    List<Schedule> findByNameStartsWith(String name);
//
//    //Stream<User> findByNameStartsWith(String name);
//
//    Schedule findByName(String name);
}
