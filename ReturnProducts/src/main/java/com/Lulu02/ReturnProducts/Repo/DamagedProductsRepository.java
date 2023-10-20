package com.Lulu02.ReturnProducts.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Lulu02.ReturnProducts.Entity.DamagedProducts;

public interface DamagedProductsRepository extends JpaRepository<DamagedProducts, Long> {
}
