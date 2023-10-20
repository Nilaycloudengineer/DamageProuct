package com.Lulu02.ReturnProducts.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "DamagedProducts")
public class DamagedProducts {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String productName;
	private String reasonToReturn;
	private String customerName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getReasonToReturn() {
		return reasonToReturn;
	}

	public void setReasonToReturn(String reasonToReturn) {
		this.reasonToReturn = reasonToReturn;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public DamagedProducts(Long id, String productName, String reasonToReturn, String customerName) {
		super();
		this.id = id;
		this.productName = productName;
		this.reasonToReturn = reasonToReturn;
		this.customerName = customerName;
	}

	public DamagedProducts() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "DamagedProducts [id=" + id + ", productName=" + productName + ", reasonToReturn=" + reasonToReturn
				+ ", customerName=" + customerName + "]";
	}

	// getters and setters

}
