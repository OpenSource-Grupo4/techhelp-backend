package com.upc.techelp.platform.monitoring.application.internal.queryservices;

import com.upc.techelp.platform.monitoring.domain.model.entities.ComponentItem;
import com.upc.techelp.platform.monitoring.domain.model.queries.GetComponentByDashBoardIdQuery;
import com.upc.techelp.platform.monitoring.domain.model.valueobjects.TechnicianId;
import com.upc.techelp.platform.monitoring.domain.services.ComponentItemQueryService;
import com.upc.techelp.platform.monitoring.infrastructure.persistence.jpa.repositories.ComponentItemRepository;
import com.upc.techelp.platform.monitoring.infrastructure.persistence.jpa.repositories.DashboardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComponentItemQueryServiceImpl implements ComponentItemQueryService {
    private ComponentItemRepository componentItemRepository;
    private DashboardRepository dashboardRepository;

    public ComponentItemQueryServiceImpl(ComponentItemRepository componentItemRepository, DashboardRepository dashboardRepository) {
        this.componentItemRepository = componentItemRepository;
        this.dashboardRepository = dashboardRepository;
    }

    @Override
    public List<ComponentItem> handle(GetComponentByDashBoardIdQuery query) {
        var dashBoard = dashboardRepository.findByTechnicianId(new TechnicianId(query.dashBoardId()));
        return componentItemRepository.findComponentItemByDashBoard(dashBoard.get());
    }
}
