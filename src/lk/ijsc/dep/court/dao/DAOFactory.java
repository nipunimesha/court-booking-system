package lk.ijsc.dep.court.dao;

import lk.ijsc.dep.court.dao.custom.impl.BookingDAOImpl;
import lk.ijsc.dep.court.dao.custom.impl.CourtDAOImpl;
import lk.ijsc.dep.court.dao.custom.impl.PaymentDAOImpl;
import lk.ijsc.dep.court.dao.custom.impl.PlayerDAOImpl;

public class DAOFactory {
    public enum DAOTypes{
        PLAYER,BOOKING,COURT,PAYMENT;

    }
    private static DAOFactory daoFactory;

    private  DAOFactory(){

    }

    public static DAOFactory getInstance(){
        if(daoFactory==null){
            daoFactory=new DAOFactory();
        }
        return daoFactory;
    }

    public<T extends SuperDAO> T getDAO(DAOTypes daoTypes){
        switch (daoTypes){
            case PLAYER:
                return (T)new PlayerDAOImpl();
            case BOOKING:
                return (T)new BookingDAOImpl();
            case COURT:
                return (T)new CourtDAOImpl();
            case PAYMENT:
                return (T)new PaymentDAOImpl();

            default:
                return null;
        }

    }
}
