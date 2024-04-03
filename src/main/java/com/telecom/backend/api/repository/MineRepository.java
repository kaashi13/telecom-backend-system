package com.telecom.backend.api.repository;

import com.telecom.backend.api.entity.MineEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MineRepository extends JpaRepository<MineEntity, Long> {
    // No need to define methods here unless you want custom queries
}
