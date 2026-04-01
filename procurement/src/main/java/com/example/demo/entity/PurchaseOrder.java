package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class PurchaseOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long vendorId;     // FK to Vendor
    private Long requestId;    // FK to ProcurementRequest
    private Double approvedPrice;
    private LocalDate orderDate;

    public PurchaseOrder() {}

    // Getters & Setters
    public Long getId() { return id; }

    public Long getVendorId() { return vendorId; }
    public void setVendorId(Long vendorId) { this.vendorId = vendorId; }

    public Long getRequestId() { return requestId; }
    public void setRequestId(Long requestId) { this.requestId = requestId; }

    public Double getApprovedPrice() { return approvedPrice; }
    public void setApprovedPrice(Double approvedPrice) { this.approvedPrice = approvedPrice; }

    public LocalDate getOrderDate() { return orderDate; }
    public void setOrderDate(LocalDate orderDate) { this.orderDate = orderDate; }
}