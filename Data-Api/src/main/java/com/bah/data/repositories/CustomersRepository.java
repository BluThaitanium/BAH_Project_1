package com.bah.data.repositories;

import org.springframework.data.repository.CrudRepository;

import com.bah.domain.Customer;


public interface CustomersRepository extends CrudRepository<Customer, Long>{

}
