package com.giullianogazzoni.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giullianogazzoni.school.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
