package com.haa.webappcrm.dao;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.haa.webappcrm.entity.Customer;
import com.haa.webappcrm.repository.CustomerRepository;
import com.haa.webappcrm.util.SortUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getCustomers() {
        return customerRepository.findAll()
                .stream()
                .sorted((i, j) -> i.getLastName().compareTo(j.getLastName()))
                .collect(Collectors.toList());
    }

    @Override
    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public Optional<Customer> getCustomer(int custId) {
        return customerRepository.findById(custId);
    }

    @Override
    public void deleteCustomer(int custId) {
        customerRepository.deleteById(custId);
    }

    @Override
    public List<Customer> searchCustomers(String searchName) {
        if (searchName != null && searchName.length() > 0)
            return customerRepository.findAll() // .searchByName(searchName.toLowerCase());
                    .stream()
                    .filter(i -> i.getFirstName().toLowerCase().indexOf(searchName) > -1
                            || i.getLastName().toLowerCase().indexOf(searchName) > -1)
                    .sorted((i, j) -> i.getLastName().compareTo(j.getLastName()))
                    .collect(Collectors.toList());
        else
            return customerRepository.findAll()
                    .stream()
                    .sorted((i, j) -> i.getLastName().compareTo(j.getLastName()))
                    .collect(Collectors.toList());
    }

    @Override
    public List<Customer> getCustomers(int theSortField) {
        String theFieldName = null;

        switch (theSortField) {
            case SortUtils.FIRST_NAME:
                theFieldName = "first_name";
                break;
            case SortUtils.LAST_NAME:
                theFieldName = "last_name";
                break;
            case SortUtils.EMAIL:
                theFieldName = "email";
                break;
            default:
                // if nothing matches the default to sort by lastName
                theFieldName = "last_name";
        }
        return customerRepository.sortByColumnName(theFieldName);
    }

}
