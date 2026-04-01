package com.example.demo.service;

import com.example.demo.entity.VendorQuote;
import com.example.demo.repository.VendorQuoteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorQuoteService {

    private final VendorQuoteRepository repository;

    public VendorQuoteService(VendorQuoteRepository repository) {
        this.repository = repository;
    }

    public VendorQuote createQuote(VendorQuote quote) {
        return repository.save(quote);
    }

    public List<VendorQuote> getAllQuotes() {
        return repository.findAll();
    }
}