package lk.ijsc.dep.court.BO.custom;

import lk.ijsc.dep.court.BO.SuperBO;
import lk.ijsc.dep.court.dto.BookingDTO;
import lk.ijsc.dep.court.dto.PlayerDTO;

import java.util.ArrayList;

public interface ManagePlayerBO extends SuperBO {
    public boolean savePlayer(PlayerDTO playerDTO)throws Exception;
    public boolean updatePlayer(PlayerDTO playerDTO)throws Exception;
    public boolean deletePlayer(int bid ) throws Exception;
    public PlayerDTO find (int bid) throws Exception;
    ArrayList<PlayerDTO> findAll()throws Exception;

}
