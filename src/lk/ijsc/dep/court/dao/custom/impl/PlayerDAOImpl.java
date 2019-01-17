package lk.ijsc.dep.court.dao.custom.impl;

import lk.ijsc.dep.court.dao.CrudUtil;
import lk.ijsc.dep.court.dao.custom.PlayerDAO;
import lk.ijsc.dep.court.db.DBConnection;
import lk.ijsc.dep.court.entity.Player;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PlayerDAOImpl implements PlayerDAO {
    @Override
    public boolean save(Player entity) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO player(nic,name,address,contact) VALUES(?,?,?,?)",entity.getNic(),entity.getName(),entity.getAddress(),entity.getContact());
    }

    @Override
    public boolean update(Player entity) throws Exception {
       return CrudUtil.executeUpdate("UPDATE player SET name =?,address=?,contact=? WHERE nic=?",entity.getNic(),entity.getName(),entity.getAddress(),entity.getContact());
    }

    @Override
    public boolean delete(Integer key) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM player WHERE nic=?",key);
    }

    @Override
    public Player find(Integer key) throws Exception {
        ResultSet rs = CrudUtil.executeQuery("SELECT * FROM player WHERE nic=?",key);
        if (rs.next()){
            Player player = new Player(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
            return player;
        }else{
            Player player = new Player();
            return player;
        }
    }

    @Override
    public ArrayList<Player> findAll() throws Exception {
        ResultSet rs= CrudUtil.executeQuery("SfELECT * FROM player");
        ArrayList <Player> players = new ArrayList <>();
        while (rs.next()){
            Player player = new Player(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
            players.add(player);
        }
        return players;
    }
}
