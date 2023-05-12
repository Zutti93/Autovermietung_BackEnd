package ch.irix.autovermietungsapp.backend.bill.model;

import ch.irix.autovermietungsapp.backend.booking.model.Booking;
import ch.irix.autovermietungsapp.backend.customer.model.Customer;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Bill {
    @Id
    private Long id;

    @OneToOne
    private Customer customer;

    @OneToOne
    private Booking booking;

    private Double invoiceTotal;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public Double getInvoiceTotal() {
        return invoiceTotal;
    }

    public void setInvoiceTotal(Double invoiceTotal) {
        this.invoiceTotal = invoiceTotal;
    }
}
