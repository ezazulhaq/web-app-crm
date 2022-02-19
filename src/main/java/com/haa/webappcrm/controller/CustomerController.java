package com.haa.webappcrm.controller;

import java.util.List;

import com.haa.webappcrm.dao.CustomerDAO;
import com.haa.webappcrm.entity.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerDAO customerDAO;

    @RequestMapping("/list")
    public String listCustomer(Model theModel) {

        List<Customer> theCustomers = customerDAO.getCustomers();

        theModel.addAttribute("customers", theCustomers);

        return "list-customer";
    }
}
