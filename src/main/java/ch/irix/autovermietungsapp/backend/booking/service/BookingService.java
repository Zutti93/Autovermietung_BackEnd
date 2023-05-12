package ch.irix.autovermietungsapp.backend.booking.service;

import ch.irix.autovermietungsapp.backend.booking.model.Booking;

import java.util.List;
import java.util.Optional;

public interface BookingService {

    public List<Booking> getAllBookings();

    public Optional<Booking> getBookingById(Long id);

    public Booking addBooking(Booking booking);
}
