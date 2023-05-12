package ch.irix.autovermietungsapp.backend.customer.service;

import ch.irix.autovermietungsapp.backend.customer.model.Customer;

import java.util.List;
import java.util.Optional;


public interface CustomerService{

    public List<Customer> getAllCustomers();

    public Optional<Customer> getCustomerById(Long id);

    public Customer addCustomer(Customer customer);
}
