package com.example.demo.controller;

import com.example.demo.entity.VendorQuote;
import com.example.demo.service.VendorQuoteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quotes")
public class VendorQuoteController {

    private final VendorQuoteService service;

    public VendorQuoteController(VendorQuoteService service) {
        this.service = service;
    }

    @PostMapping
    public VendorQuote createQuote(@RequestBody VendorQuote quote) {
        return service.createQuote(quote);
    }

    @GetMapping
    public List<VendorQuote> getAllQuotes() {
        return service.getAllQuotes();
    }
}