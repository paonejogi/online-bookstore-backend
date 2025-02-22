package com.example.online_bookstore.repositories;

import com.example.online_bookstore.models.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
