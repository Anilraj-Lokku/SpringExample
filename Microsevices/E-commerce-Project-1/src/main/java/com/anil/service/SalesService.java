package com.anil.service;

import com.anil.entity.Sales;
import com.anil.repository.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalesService {

    @Autowired
    private SalesRepository salesRepository;

    public List<Sales> getAllSales() {
        return salesRepository.findAll();
    }

    public Sales getSalesById(Long id) {
        Optional<Sales> optionalSales = salesRepository.findById(id);
        return optionalSales.orElse(null);
    }

    public Sales createOrUpdateSales(Sales sales) {
        return salesRepository.save(sales);
    }

    public void deleteSales(Long id) {
        salesRepository.deleteById(id);
    }
}
