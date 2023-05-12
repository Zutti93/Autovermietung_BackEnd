package ch.irix.autovermietungsapp.backend.employee.service;

import ch.irix.autovermietungsapp.backend.employee.model.Employee;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public Optional<Employee> getEmployeeById(Long id);

    public Employee addEmployee(Employee employee);
}
