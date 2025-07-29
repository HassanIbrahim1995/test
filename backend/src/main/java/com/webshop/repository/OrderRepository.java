package com.webshop.repository;

import com.webshop.entity.Order;
import com.webshop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByUser(User user);
    List<Order> findByTrackingNumber(String trackingNumber);
}