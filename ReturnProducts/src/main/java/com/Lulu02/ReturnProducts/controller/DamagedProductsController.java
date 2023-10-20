package com.Lulu02.ReturnProducts.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Lulu02.ReturnProducts.Entity.DamagedProducts;
import com.Lulu02.ReturnProducts.Repo.DamagedProductsRepository;

@RestController
@RequestMapping("/api/damaged-products")
public class DamagedProductsController {
	private final DamagedProductsRepository damagedProductsRepository;

	public DamagedProductsController(DamagedProductsRepository damagedProductsRepository) {
		this.damagedProductsRepository = damagedProductsRepository;
	}

	// Create (POST) a new damaged product
	@PostMapping
	public DamagedProducts createDamagedProduct(@RequestBody DamagedProducts damagedProduct) {
		return damagedProductsRepository.save(damagedProduct);
	}

	// Read (GET) all damaged products
	@GetMapping
	public List<DamagedProducts> getAllDamagedProducts() {
		return damagedProductsRepository.findAll();
	}

	// Read (GET) a single damaged product by ID
	@GetMapping("/{id}")
	public ResponseEntity<DamagedProducts> getDamagedProductById(@PathVariable Long id) {
		java.util.Optional<DamagedProducts> damagedProduct = damagedProductsRepository.findById(id);
		if (damagedProduct.isPresent()) {
			return ResponseEntity.ok(damagedProduct.get());
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	// Update (PUT) an existing damaged product
	@PutMapping("/{id}")
	public ResponseEntity<DamagedProducts> updateDamagedProduct(@PathVariable Long id,
			@RequestBody DamagedProducts updatedDamagedProduct) {
		if (damagedProductsRepository.existsById(id)) {
			updatedDamagedProduct.setId(id);
			DamagedProducts savedDamagedProduct = damagedProductsRepository.save(updatedDamagedProduct);
			return ResponseEntity.ok(savedDamagedProduct);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	// Delete (DELETE) a damaged product by ID
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteDamagedProduct(@PathVariable Long id) {
		if (damagedProductsRepository.existsById(id)) {
			damagedProductsRepository.deleteById(id);
			return ResponseEntity.noContent().build();
		} else {
			return ResponseEntity.notFound().build();
		}
	}
}
