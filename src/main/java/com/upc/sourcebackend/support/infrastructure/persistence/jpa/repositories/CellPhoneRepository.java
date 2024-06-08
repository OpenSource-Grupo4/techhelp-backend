package com.upc.sourcebackend.support.infrastructure.persistence.jpa.repositories;

import com.upc.sourcebackend.support.domain.model.aggregates.CellPhone;
import com.upc.sourcebackend.support.domain.model.valueObjects.CellPhoneId;
import com.upc.sourcebackend.support.domain.model.valueObjects.TechnicianId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CellPhoneRepository extends JpaRepository<CellPhone,Long> {
    Optional<CellPhone> findCellPhoneById(CellPhoneId id);
    Optional<CellPhone> findCellPhonesByTechnicianId(TechnicianId id);
}
