package com.nisum.PurchaseService.service;

import com.nisum.PurchaseService.entity.Purchase;
import com.nisum.PurchaseService.repository.PurchaseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PurchaseService {
    private PurchaseRepository purchaseRepository;

    public List<Purchase> getAllPurchases() {
        return purchaseRepository.findAll();
    }

}
