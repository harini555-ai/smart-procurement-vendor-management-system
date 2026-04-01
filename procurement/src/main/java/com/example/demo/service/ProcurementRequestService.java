package com.example.demo.service;

import com.example.demo.entity.ProcurementRequest;
import com.example.demo.repository.ProcurementRequestRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProcurementRequestService {

    private final ProcurementRequestRepository repository;

    public ProcurementRequestService(ProcurementRequestRepository repository) {
        this.repository = repository;
    }

    public ProcurementRequest createRequest(ProcurementRequest request) {
        request.setStatus("Pending");
        return repository.save(request);
    }

    public List<ProcurementRequest> getAllRequests() {
        return repository.findAll();
    }

    public ProcurementRequest approveRequest(Long id) {
        ProcurementRequest request = repository.findById(id).orElseThrow();
        request.setStatus("Approved");
        return repository.save(request);
    }

    public ProcurementRequest rejectRequest(Long id) {
        ProcurementRequest request = repository.findById(id).orElseThrow();
        request.setStatus("Rejected");
        return repository.save(request);
    }
}