package com.ust.ProgramService.repository;

import com.ust.ProgramService.model.Program;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProgramRepository extends JpaRepository<Program,Integer> {


    List<Program> findByGymId(int gymId);
}
