package com.upc.techelp.platform.monitoring.infrastructure.persistence.jpa.repositories;

import com.upc.techelp.platform.monitoring.domain.model.entities.ComponentItem;
import com.upc.techelp.platform.monitoring.domain.model.entities.DashBoard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComponentItemRepository extends JpaRepository<ComponentItem,Long> {
    List<ComponentItem> findComponentItemByDashBoard(DashBoard dashBoard);
    boolean deleteByDashBoard(DashBoard dashBoard);
}
