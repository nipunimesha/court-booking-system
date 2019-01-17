package lk.ijsc.dep.court.BO.custom;

import lk.ijsc.dep.court.BO.SuperBO;
import lk.ijsc.dep.court.dto.BookingDTO;
import lk.ijsc.dep.court.dto.PaymentDTO;

import java.util.ArrayList;

public interface ManagePaymentBO extends SuperBO {
    public boolean savePayment(PaymentDTO paymentDTO)throws Exception;
    public boolean updatePayment(PaymentDTO paymentDTO)throws Exception;
    public boolean deletePayment(int pid ) throws Exception;
    public PaymentDTO find (int pid) throws Exception;
    ArrayList<PaymentDTO> findAll()throws Exception;

}
