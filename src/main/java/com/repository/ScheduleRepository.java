package com.repository;

import com.shema.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * ScheduleRepository provides the necessary search operations
 */
public interface ScheduleRepository extends JpaRepository<Schedule, Long> {

}
