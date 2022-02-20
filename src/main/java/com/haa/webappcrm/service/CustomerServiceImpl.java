package com.haa.webappcrm.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import com.haa.webappcrm.dao.CustomerDAO;
import com.haa.webappcrm.entity.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDAO customerDAO;

    @Override
    @Transactional
    public List<Customer> getCustomers() {
        return customerDAO.getCustomers();

    }

    @Override
    @Transactional
    public void saveCustomer(Customer customer) {
        customerDAO.saveCustomer(customer);
    }

    @Override
    @Transactional
    public Optional<Customer> getCustomer(int custId) {
        return customerDAO.getCustomer(custId);
    }

    @Override
    @Transactional
    public void deleteCustomer(int custId) {
        customerDAO.deleteCustomer(custId);
    }

}
