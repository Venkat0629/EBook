package com.nisum.PurchaseService.controller;

import com.nisum.PurchaseService.entity.Purchase;
import com.nisum.PurchaseService.service.PurchaseService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/purchase")
public class PurchaseController {
    private PurchaseService purchaseService;

    @GetMapping
    public ResponseEntity<List<Purchase>> fetchPurchases() {
        List<Purchase> purchases = purchaseService.getAllPurchases();
        if (purchases == null || purchases.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(purchases, HttpStatus.OK);
    }
}
