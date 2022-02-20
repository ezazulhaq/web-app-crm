package com.haa.webappcrm.service;

import java.util.List;
import java.util.Optional;

import com.haa.webappcrm.entity.Customer;

public interface CustomerService {

    public List<Customer> getCustomers();

    public void saveCustomer(Customer customer);

    public Optional<Customer> getCustomer(int custId);

    public void deleteCustomer(int custId);

    public List<Customer> searchCustomers(String searchName);

}
