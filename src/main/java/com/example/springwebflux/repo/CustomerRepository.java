package com.example.springwebflux.repo;


import com.example.springwebflux.model.Customer;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface CustomerRepository extends ReactiveCrudRepository<Customer,Integer> {

}
