package com.haa.webappcrm.controller;

import java.util.List;

import com.haa.webappcrm.entity.Customer;
import com.haa.webappcrm.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/list")
    public String listCustomer(Model theModel) {

        List<Customer> theCustomers = customerService.getCustomers();

        theModel.addAttribute("customers", theCustomers);

        return "list-customer";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel) {

        Customer theCustomer = new Customer();

        theModel.addAttribute("customer", theCustomer);

        return "customer-form";
    }
}
