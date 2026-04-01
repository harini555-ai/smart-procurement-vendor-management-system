package com.example.demo.repository;

import com.example.demo.entity.VendorQuote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendorQuoteRepository extends JpaRepository<VendorQuote, Long> {
}