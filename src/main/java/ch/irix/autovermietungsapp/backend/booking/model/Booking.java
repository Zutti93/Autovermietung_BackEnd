package ch.irix.autovermietungsapp.backend.booking.model;

import ch.irix.autovermietungsapp.backend.customer.model.Customer;
import ch.irix.autovermietungsapp.backend.employee.model.Employee;
import ch.irix.autovermietungsapp.backend.vehicle.model.Vehicle;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

import java.time.LocalDateTime;

@Entity
public class Booking {
    @Id
    private Long id;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    @OneToOne
    private Customer customer;

    @OneToOne
    private Employee responsibleEmployee;

    @OneToOne
    private Vehicle vehicle;

    private String newDamages;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getNewDamages() {
        return newDamages;
    }

    public void setNewDamages(String newDamages) {
        this.newDamages = newDamages;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getResponsibleEmployee() {
        return responsibleEmployee;
    }

    public void setResponsibleEmployee(Employee responsibleEmployee) {
        this.responsibleEmployee = responsibleEmployee;
    }
}
