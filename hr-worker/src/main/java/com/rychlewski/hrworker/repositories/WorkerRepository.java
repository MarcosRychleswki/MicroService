package com.rychlewski.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rychlewski.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
