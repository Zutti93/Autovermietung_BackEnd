package ch.irix.autovermietungsapp.backend.employee.repository;

import ch.irix.autovermietungsapp.backend.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
