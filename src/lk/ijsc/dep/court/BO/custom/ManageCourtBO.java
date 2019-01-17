package lk.ijsc.dep.court.BO.custom;

import lk.ijsc.dep.court.BO.SuperBO;
import lk.ijsc.dep.court.dto.BookingDTO;
import lk.ijsc.dep.court.dto.CourtDTO;

import java.util.ArrayList;

public interface ManageCourtBO extends SuperBO {
    public boolean saveCourt(CourtDTO courtDTO)throws Exception;
    public boolean updateCourt(CourtDTO courtDTO)throws Exception;
    public boolean deleteCourt(int cid ) throws Exception;
    public CourtDTO find (int cid) throws Exception;
    ArrayList<CourtDTO> findAll()throws Exception;

}
