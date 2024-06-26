package com.anil.controller;

import com.anil.entity.Sales;
import com.anil.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sales")
public class SalesController {

    @Autowired
    private SalesService salesService;

    @GetMapping
    public ResponseEntity<List<Sales>> getAllSales() {
        List<Sales> sales = salesService.getAllSales();
        return ResponseEntity.ok(sales);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Sales> getSalesById(@PathVariable Long id) {
        Sales sales = salesService.getSalesById(id);
        return ResponseEntity.ok(sales);
    }

    @PostMapping
    public ResponseEntity<Sales> createSales(@RequestBody Sales sales) {
        Sales createdSales = salesService.createOrUpdateSales(sales);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdSales);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Sales> updateSales(@PathVariable Long id, @RequestBody Sales sales) {
        sales.setId(id); // Ensure the ID is set from path variable
        Sales updatedSales = salesService.createOrUpdateSales(sales);
        return ResponseEntity.ok(updatedSales);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSales(@PathVariable Long id) {
        salesService.deleteSales(id);
        return ResponseEntity.noContent().build();
    }
}
