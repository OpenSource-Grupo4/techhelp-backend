package com.upc.sourcebackend.support.infrastructure.persistence.jpa.repositories;

import com.upc.sourcebackend.support.domain.model.aggregates.Technician;
import com.upc.sourcebackend.support.domain.model.valueObjects.TaskId;
import com.upc.sourcebackend.support.domain.model.valueObjects.TechnicianId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TechnicianRepository extends JpaRepository<Technician, Long> {
    Optional<Technician> findTechnicianById(TechnicianId id);
    Optional<Technician> findTechnicianTaskById(TaskId id);
}
