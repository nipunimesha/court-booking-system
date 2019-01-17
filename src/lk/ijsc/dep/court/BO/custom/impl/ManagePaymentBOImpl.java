package lk.ijsc.dep.court.BO.custom.impl;

import lk.ijsc.dep.court.BO.custom.ManagePaymentBO;
import lk.ijsc.dep.court.dao.DAOFactory;
import lk.ijsc.dep.court.dao.custom.PaymentDAO;
import lk.ijsc.dep.court.dao.custom.PlayerDAO;
import lk.ijsc.dep.court.dto.PaymentDTO;
import lk.ijsc.dep.court.dto.PlayerDTO;
import lk.ijsc.dep.court.entity.Payment;
import lk.ijsc.dep.court.entity.Player;

import java.util.ArrayList;

public class ManagePaymentBOImpl implements ManagePaymentBO {

    PaymentDAO paymentDAO = (PaymentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.PAYMENT);

    @Override
    public boolean savePayment(PaymentDTO paymentDTO) throws Exception {
        Payment payment = new Payment(paymentDTO.getPid(), paymentDTO.getPrice(), paymentDTO.getHours());
        return paymentDAO.save(payment);

    }

    @Override
    public boolean updatePayment(PaymentDTO paymentDTO) throws Exception {
        Payment payment = new Payment(paymentDTO.getPid(), paymentDTO.getPrice(), paymentDTO.getHours());
        return paymentDAO.update(payment);


    }

    @Override
    public boolean deletePayment(int pid) throws Exception {

        return paymentDAO.delete(pid);
    }

    @Override
    public PaymentDTO find(int pid) throws Exception {
        Payment payment = paymentDAO.find(pid);
        PaymentDTO paymentDTO = new PaymentDTO(payment.getPid(), payment.getPrice(), payment.getHours());
        return paymentDTO;
    }

    @Override
    public ArrayList <PaymentDTO> findAll() throws Exception {
        ArrayList <PaymentDTO> arrayList = new ArrayList <>();
        ArrayList <Payment> arrayList1 = paymentDAO.findAll();
        for (Payment payment : arrayList1) {
            PaymentDTO paymentDTO = new PaymentDTO(payment.getPid(), payment.getPrice(), payment.getHours());
            arrayList.add(paymentDTO);
        }
        return arrayList;
    }
}
