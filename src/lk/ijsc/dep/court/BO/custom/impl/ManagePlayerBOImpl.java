package lk.ijsc.dep.court.BO.custom.impl;

import lk.ijsc.dep.court.BO.custom.ManagePlayerBO;
import lk.ijsc.dep.court.dao.DAOFactory;
import lk.ijsc.dep.court.dao.custom.PlayerDAO;
import lk.ijsc.dep.court.dto.PlayerDTO;
import lk.ijsc.dep.court.entity.Player;

import java.util.ArrayList;

public class ManagePlayerBOImpl implements ManagePlayerBO {

    PlayerDAO playerDAO= (PlayerDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.PLAYER);


    @Override
    public boolean savePlayer(PlayerDTO playerDTO) throws Exception {
        Player player= new Player(playerDTO.getNic(),playerDTO.getName(),playerDTO.getAddress(),playerDTO.getContact());
        return playerDAO.save(player);
    }

    @Override
    public boolean updatePlayer(PlayerDTO playerDTO) throws Exception {
        Player player=new Player(playerDTO.getNic(),playerDTO.getName(),playerDTO.getAddress(),playerDTO.getContact());
        return playerDAO.update(player);
    }

    @Override
    public boolean deletePlayer(int bid) throws Exception {

        return playerDAO.delete(bid);

    }

    @Override
    public PlayerDTO find(int bid) throws Exception {
        Player player=playerDAO.find(bid);
        if(player == null){
            PlayerDTO playerDTO = new PlayerDTO(0,"0","0",0);
            return playerDTO;
        }
        PlayerDTO playerDTO= new PlayerDTO(player.getNic(),player.getName(),player.getAddress(),player.getContact());
        return playerDTO;

    }

    @Override
    public ArrayList<PlayerDTO> findAll() throws Exception {
        ArrayList<PlayerDTO> arrayList= new ArrayList <>();
        ArrayList<Player> arrayList1=playerDAO.findAll();
        for (Player player : arrayList1) {
            PlayerDTO playerDTO= new PlayerDTO(player.getNic(),player.getName(),player.getAddress(),player.getContact());
            arrayList.add(playerDTO);


        }

        return arrayList;

    }
}
