package ch.irix.autovermietungsapp.backend.vehicle.service;

import ch.irix.autovermietungsapp.backend.vehicle.model.Vehicle;

import java.util.List;
import java.util.Optional;

public interface VehicleService {

    public List<Vehicle> getAllVehicles();

    public Optional<Vehicle> getVehicleById(Long id);

    public Vehicle addVehicle(Vehicle vehicle);
}
