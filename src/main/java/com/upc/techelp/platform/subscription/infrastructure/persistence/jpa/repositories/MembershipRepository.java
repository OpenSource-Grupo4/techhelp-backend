package com.upc.techelp.platform.subscription.infrastructure.persistence.jpa.repositories;

import com.upc.techelp.platform.subscription.domain.model.entities.Membership;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MembershipRepository extends JpaRepository<Membership, Long> {

    Optional<Membership> findByTitle(String title);

    boolean existsByTitle(String title);

    boolean existsByTitleAndIdIsNot(String title, Long id);
}
