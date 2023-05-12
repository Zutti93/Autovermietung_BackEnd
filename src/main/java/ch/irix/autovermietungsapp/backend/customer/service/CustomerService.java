package ch.irix.autovermietungsapp.backend.customer.service;

import ch.irix.autovermietungsapp.backend.customer.model.Customer;
import ch.irix.autovermietungsapp.backend.customer.repository.CustomerRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface CustomerService impl{

    public List<Customer> getAllCustomers();

    public Optional<Customer> getCustomerById(Long id);

    public Customer addCustomer(Customer customer);
}
