package com.repository;

import com.shema.Disciplines;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;

/**
 * DisciplinesRepository provides the necessary search operations
 */
public interface DisciplinesRepository extends JpaRepository<Disciplines, Long> {

    @Query("SELECT name_subject FROM Disciplines")
    Collection<Disciplines> findAllDisciplines();
}
