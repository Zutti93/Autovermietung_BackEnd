package ch.irix.autovermietungsapp.backend.booking.repository;

import ch.irix.autovermietungsapp.backend.booking.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
