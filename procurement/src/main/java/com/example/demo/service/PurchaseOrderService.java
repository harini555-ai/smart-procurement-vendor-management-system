package com.example.demo.service;

import com.example.demo.entity.PurchaseOrder;
import com.example.demo.repository.PurchaseOrderRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PurchaseOrderService {

    private final PurchaseOrderRepository repository;

    public PurchaseOrderService(PurchaseOrderRepository repository) {
        this.repository = repository;
    }

    public PurchaseOrder createOrder(PurchaseOrder order) {
        order.setOrderDate(LocalDate.now());
        return repository.save(order);
    }

    public List<PurchaseOrder> getAllOrders() {
        return repository.findAll();
    }
}