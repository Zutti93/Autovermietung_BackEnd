package ch.irix.autovermietungsapp.backend.bill.service;

import ch.irix.autovermietungsapp.backend.bill.model.Bill;
import ch.irix.autovermietungsapp.backend.bill.repository.BillRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class BillServiceImpl implements BillService{

    @Autowired
    BillRepository billRepository;

    @Override
    public List<Bill> getAllBills() {
        return billRepository.findAll();
    }

    @Override
    public Optional<Bill> getBillById(Long id) {
        return billRepository.findById(id);
    }

    @Override
    public Bill addBill(Bill bill) {
        return billRepository.save(bill);
    }
}
