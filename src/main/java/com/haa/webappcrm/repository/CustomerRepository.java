package com.haa.webappcrm.repository;

import java.util.List;

import com.haa.webappcrm.entity.Customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query(value = "select * from customer order by ?1", nativeQuery = true)
    List<Customer> sortByColumnName(String theFieldName);
}
