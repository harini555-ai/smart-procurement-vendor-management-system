package com.example.demo.controller;

import com.example.demo.entity.PurchaseOrder;
import com.example.demo.service.PurchaseOrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class PurchaseOrderController {

    private final PurchaseOrderService service;

    public PurchaseOrderController(PurchaseOrderService service) {
        this.service = service;
    }

    @PostMapping
    public PurchaseOrder createOrder(@RequestBody PurchaseOrder order) {
        return service.createOrder(order);
    }

    @GetMapping
    public List<PurchaseOrder> getAllOrders() {
        return service.getAllOrders();
    }
}