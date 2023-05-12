package ch.irix.autovermietungsapp.backend.vehicle.repository;

import ch.irix.autovermietungsapp.backend.vehicle.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

}
