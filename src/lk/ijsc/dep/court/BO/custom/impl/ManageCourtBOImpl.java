package lk.ijsc.dep.court.BO.custom.impl;

import lk.ijsc.dep.court.BO.custom.ManageCourtBO;
import lk.ijsc.dep.court.dao.DAOFactory;
import lk.ijsc.dep.court.dao.custom.CourtDAO;
import lk.ijsc.dep.court.dto.CourtDTO;
import lk.ijsc.dep.court.entity.Court;

import java.util.ArrayList;

public class ManageCourtBOImpl implements ManageCourtBO {

    CourtDAO courtDAO = (CourtDAO)DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.COURT);

    @Override
    public boolean saveCourt(CourtDTO courtDTO) throws Exception {
        Court court = new Court(courtDTO.getCid(),courtDTO.getTown(),courtDTO.getName());
        return courtDAO.save(court);
    }

    @Override
    public boolean updateCourt(CourtDTO courtDTO) throws Exception {
        Court court = new Court(courtDTO.getCid(),courtDTO.getTown(),courtDTO.getName());
        return courtDAO.update(court);
    }

    @Override
    public boolean deleteCourt(int cid) throws Exception {
        return courtDAO.delete(cid);
    }

    @Override
    public CourtDTO find(int cid) throws Exception {
        Court court = courtDAO.find(cid);
        CourtDTO court1 = new CourtDTO(court.getCid(),court.getTown(),court.getName());
        return court1;
    }

    @Override
    public ArrayList<CourtDTO> findAll() throws Exception {

        ArrayList<CourtDTO> arrayList= new ArrayList <>();
        ArrayList<Court> arrayList1=courtDAO.findAll();
        for (Court court: arrayList1) {
            CourtDTO courtDTO = new CourtDTO(court.getCid(),court.getTown(),court.getName());
            arrayList.add(courtDTO);
        }
        return arrayList;
    }
}
