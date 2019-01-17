package lk.ijsc.dep.court.dao.custom.impl;

import lk.ijsc.dep.court.dao.CrudUtil;
import lk.ijsc.dep.court.dao.custom.PaymentDAO;
import lk.ijsc.dep.court.entity.Booking;
import lk.ijsc.dep.court.entity.Payment;
import lk.ijsc.dep.court.entity.Player;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PaymentDAOImpl implements PaymentDAO {
    @Override
    public boolean save(Payment entity) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Player (nic ,name,address,contact) VALUES (?,?,?,?)",entity.getPid(),entity.getPrice(),entity.getHours());

    }

    @Override
    public boolean update(Payment entity) throws Exception {
        return CrudUtil.executeUpdate("UPDATE player SET name =?,address=?,contact=? WHERE nic=?",entity.getPid(),entity.getPrice(),entity.getHours());


    }

    @Override
    public boolean delete(Integer key) throws Exception {
        return CrudUtil.executeUpdate("Delete from player where bid=?",key);

    }

    @Override
    public Payment find(Integer key) throws Exception {
        ResultSet resultSet= CrudUtil.executeQuery("SELECT * FROM Payment WHERE nic=?",key);
        resultSet.next();
        Payment payment = new Payment(resultSet.getInt(1), resultSet.getDouble(2), resultSet.getInt(3));
        return payment;
    }

    @Override
    public ArrayList<Payment> findAll() throws Exception {
        ResultSet rs=CrudUtil.executeQuery("select * from payment");
        ArrayList<Payment> arrayList=new ArrayList <>();
        while (rs.next()) {
            Payment payment = new Payment(rs.getInt(1), rs.getDouble(2), rs.getInt(3));

            arrayList.add(payment);
        }
        return  arrayList;
    }
}
