package ch.irix.autovermietungsapp.backend.customer.repository;

import ch.irix.autovermietungsapp.backend.customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
