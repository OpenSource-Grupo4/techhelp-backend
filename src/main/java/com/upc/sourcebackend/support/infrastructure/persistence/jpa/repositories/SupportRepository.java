package com.upc.sourcebackend.support.infrastructure.persistence.jpa.repositories;

import com.upc.sourcebackend.support.domain.model.aggregates.Task;
import com.upc.sourcebackend.support.domain.model.valueObjects.TaskId;
import com.upc.sourcebackend.support.domain.model.valueObjects.TechnicianId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SupportRepository extends JpaRepository<Task, Long> {
    Optional<Task> findSupportByTechnicianId(TechnicianId id);
    Optional<Task> findSupportById(TaskId id);
}
