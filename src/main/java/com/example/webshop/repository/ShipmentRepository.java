package com.example.webshop.repository;

import com.example.webshop.model.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipmentRepository extends JpaRepository<Shipment, Long> {
    Shipment findByTrackingNumber(String trackingNumber);
}