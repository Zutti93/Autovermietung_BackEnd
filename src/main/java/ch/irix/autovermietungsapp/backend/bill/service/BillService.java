package ch.irix.autovermietungsapp.backend.bill.service;

import ch.irix.autovermietungsapp.backend.bill.model.Bill;

import java.util.List;
import java.util.Optional;

public interface BillService {

    public List<Bill> getAllBills();

    public Optional<Bill> getBillById(Long id);

    public Bill addBill(Bill bill);
}
