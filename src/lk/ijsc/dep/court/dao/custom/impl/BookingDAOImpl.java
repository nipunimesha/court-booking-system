package lk.ijsc.dep.court.dao.custom.impl;

import lk.ijsc.dep.court.dao.CrudUtil;
import lk.ijsc.dep.court.dao.custom.BookingDAO;
import lk.ijsc.dep.court.db.DBConnection;
import lk.ijsc.dep.court.entity.Booking;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BookingDAOImpl implements BookingDAO {
    @Override
    public boolean save(Booking entity) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO booking(time,date,bid,fnic,fcid,fpid,) VALUES (?,?,?,?,?,?,?)",entity.getTime(),entity.getDate(),entity.getBid(),entity.getFcid(),entity.getFnic(),entity.getFpid());





    }

    @Override
    public boolean update(Booking entity) throws Exception {

       return CrudUtil.executeUpdate("UPDATE player SET name =?,address=?,contact=? WHERE nic=?",entity.getTime(),entity.getDate(),entity.getBid(),entity.getFcid(),entity.getFnic(),entity.getFpid());
    }

    @Override
    public boolean delete(Integer key) throws Exception {
        return CrudUtil.executeUpdate("Delete from player where bid=?",key);

    }

    @Override
    public Booking find(Integer key) throws Exception {
        ResultSet resultSet= CrudUtil.executeQuery("SELECT * FROM player WHERE nic=?",key);
        resultSet.next();
        Booking booking=new Booking(resultSet.getTime(1),resultSet.getDate(2),resultSet.getInt(3),resultSet.getInt(4),resultSet.getInt(5),resultSet.getInt(6));
        return booking;


    }

    @Override
    public ArrayList<Booking> findAll() throws Exception {
        ResultSet rs=CrudUtil.executeQuery("select * from booking");
        ArrayList<Booking> arrayList=new ArrayList <>();
        while (rs.next()) {
            Booking booking = new Booking(rs.getTime(1), rs.getDate(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getInt(6));
            arrayList.add(booking);
        }
        return  arrayList;
    }
}
