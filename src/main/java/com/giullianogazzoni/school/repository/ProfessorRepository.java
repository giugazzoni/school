package com.giullianogazzoni.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giullianogazzoni.school.model.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {

}
