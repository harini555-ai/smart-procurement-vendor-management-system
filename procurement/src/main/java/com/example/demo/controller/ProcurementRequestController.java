package com.example.demo.controller;

import com.example.demo.entity.ProcurementRequest;
import com.example.demo.service.ProcurementRequestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/requests")
public class ProcurementRequestController {

    private final ProcurementRequestService service;

    public ProcurementRequestController(ProcurementRequestService service) {
        this.service = service;
    }

    @PostMapping
    public ProcurementRequest createRequest(@RequestBody ProcurementRequest request) {
        return service.createRequest(request);
    }

    @GetMapping
    public List<ProcurementRequest> getAllRequests() {
        return service.getAllRequests();
    }

    @PutMapping("/{id}/approve")
    public ProcurementRequest approveRequest(@PathVariable Long id) {
        return service.approveRequest(id);
    }

    @PutMapping("/{id}/reject")
    public ProcurementRequest rejectRequest(@PathVariable Long id) {
        return service.rejectRequest(id);
    }
}