package com.example.online_bookstore.repositories;

import com.example.online_bookstore.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
