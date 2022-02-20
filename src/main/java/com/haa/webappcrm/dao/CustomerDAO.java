package com.haa.webappcrm.dao;

import java.util.List;
import java.util.Optional;

import com.haa.webappcrm.entity.Customer;

public interface CustomerDAO {

    public List<Customer> getCustomers();

    public void saveCustomer(Customer customer);

    public Optional<Customer> getCustomer(int custId);

    public void deleteCustomer(int custId);

    public List<Customer> searchCustomers(String searchName);

    public List<Customer> getCustomers(int theSortField);

}
