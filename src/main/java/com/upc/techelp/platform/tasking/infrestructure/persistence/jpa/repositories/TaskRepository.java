package com.upc.techelp.platform.tasking.infrestructure.persistence.jpa.repositories;
import com.upc.techelp.platform.repairing.domain.model.entities.Technical;
import com.upc.techelp.platform.tasking.domain.model.entities.Task;
import com.upc.techelp.platform.tasking.domain.model.valueobjects.ClientName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{


    Optional<Task> findByname(ClientName clientName);
    List<Task> findBytechnical(Technical technical);
}
