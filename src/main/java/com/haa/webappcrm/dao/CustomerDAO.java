package com.haa.webappcrm.dao;

import java.util.List;

import com.haa.webappcrm.entity.Customer;

public interface CustomerDAO {

    public List<Customer> getCustomers();

    public void saveCustomer(Customer customer);

}
