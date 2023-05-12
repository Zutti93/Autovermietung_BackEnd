package ch.irix.autovermietungsapp.backend.bill.repository;

import ch.irix.autovermietungsapp.backend.bill.model.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill, Long> {
}
