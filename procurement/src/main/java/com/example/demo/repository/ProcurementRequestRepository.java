package com.example.demo.repository;

import com.example.demo.entity.ProcurementRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcurementRequestRepository extends JpaRepository<ProcurementRequest, Long> {
}
