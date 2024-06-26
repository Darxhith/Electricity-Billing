package com.electricity.billing.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.electricity.billing.system.entity.CustomerModel;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerModel, Integer> {
	
	public CustomerModel findByEmailAndPassword(String email, String password);
	
	public CustomerModel findByMeterNumber(String meterNumber);

	public CustomerModel findCustomerDetailsByMeterNumber(String meterNumber);

}
