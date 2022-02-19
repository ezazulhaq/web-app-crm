package com.haa.webappcrm.dao;

import java.util.List;

import javax.transaction.Transactional;

import com.haa.webappcrm.entity.Customer;
import com.haa.webappcrm.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    @Transactional
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

}
