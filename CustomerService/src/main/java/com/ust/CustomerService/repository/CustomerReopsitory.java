package com.ust.CustomerService.repository;

import com.ust.CustomerService.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerReopsitory extends JpaRepository<Customer, Integer> {

    List<Customer> findByMembershipId(int memberId);
}
