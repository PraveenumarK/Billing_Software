package com.pk.customer.customer_service.repository;

import com.pk.customer.customer_service.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
