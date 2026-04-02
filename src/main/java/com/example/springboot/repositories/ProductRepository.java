package com.example.springboot.repositories;

import com.example.springboot.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository                                    // Passa para o JPA o Model e o tipo do ID, que é UUID
public interface ProductRepository extends JpaRepository<ProductModel, UUID> {
}
