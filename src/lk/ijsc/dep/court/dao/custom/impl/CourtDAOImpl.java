package lk.ijsc.dep.court.dao.custom.impl;

import lk.ijsc.dep.court.dao.CrudUtil;
import lk.ijsc.dep.court.dao.custom.CourtDAO;
import lk.ijsc.dep.court.entity.Court;
import lk.ijsc.dep.court.entity.Payment;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CourtDAOImpl implements CourtDAO {
    @Override
    public boolean save(Court entity) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Court (cid ,Town,name) VALUES (?,?,?)",entity.getCid(),entity.getTown(),entity.getName());

    }

    @Override
    public boolean update(Court entity) throws Exception {
        return CrudUtil.executeUpdate("UPDATE player SET name =?,address=?,contact=? WHERE nic=?",entity.getCid(),entity.getTown(),entity.getName());


    }

    @Override
    public boolean delete(Integer key) throws Exception {
        return CrudUtil.executeUpdate("Delete from Court where cid=?",key);

    }

    @Override
    public Court find(Integer key) throws Exception {
        ResultSet resultSet= CrudUtil.executeQuery("SELECT * FROM Payment WHERE nic=?",key);
        resultSet.next();
        Court court = new Court(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3));
        return court;


    }

    @Override
    public ArrayList<Court> findAll() throws Exception {
        ResultSet rs=CrudUtil.executeQuery("select * from payment");
        ArrayList<Court> arrayList=new ArrayList <>();
        while (rs.next()) {
            Court court = new Court(rs.getInt(1), rs.getString(2), rs.getString(3));

            arrayList.add(court);
        }
        return  arrayList;

    }
}
