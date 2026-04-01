package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class VendorQuote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long vendorId;    // FK to Vendor
    private Long requestId;   // FK to ProcurementRequest
    private Double price;
    private String deliveryTime;

    public VendorQuote() {}

    // Getters & Setters
    public Long getId() { return id; }

    public Long getVendorId() { return vendorId; }
    public void setVendorId(Long vendorId) { this.vendorId = vendorId; }

    public Long getRequestId() { return requestId; }
    public void setRequestId(Long requestId) { this.requestId = requestId; }

    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }

    public String getDeliveryTime() { return deliveryTime; }
    public void setDeliveryTime(String deliveryTime) { this.deliveryTime = deliveryTime; }
}