package com.main.project.product.repository;

import com.main.project.member.entity.RefreshToken;
import com.main.project.product.entity.Product;
import com.main.project.product.entity.Productdeny;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

}