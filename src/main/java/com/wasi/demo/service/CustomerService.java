package com.wasi.demo.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.wasi.demo.customer.Customer;
import com.wasi.demo.customer.CustomerRepository;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    public List<Customer> getCustomersByLastName(String lastName) {
        return customerRepository.findByLastName(lastName);
    }

    public void deleteCustomerById(Long id) {
        customerRepository.deleteById(id);
    }
}
