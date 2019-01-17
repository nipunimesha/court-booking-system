package lk.ijsc.dep.court.BO;

import lk.ijsc.dep.court.BO.custom.impl.ManageBookingBOImpl;
import lk.ijsc.dep.court.BO.custom.impl.ManageCourtBOImpl;
import lk.ijsc.dep.court.BO.custom.impl.ManagePaymentBOImpl;
import lk.ijsc.dep.court.BO.custom.impl.ManagePlayerBOImpl;
import lk.ijsc.dep.court.dao.DAOFactory;
import lk.ijsc.dep.court.dao.SuperDAO;
import lk.ijsc.dep.court.dao.custom.impl.BookingDAOImpl;
import lk.ijsc.dep.court.dao.custom.impl.CourtDAOImpl;
import lk.ijsc.dep.court.dao.custom.impl.PaymentDAOImpl;
import lk.ijsc.dep.court.dao.custom.impl.PlayerDAOImpl;

public class BOFactory {
    public enum BOTypes{
        PLAYERBO,BOOKINGBO,COURTBO,PAYMENTBO;

    }
    private static BOFactory boFactory;

    private  BOFactory(){

    }

    public static BOFactory getInstance(){
        if(boFactory==null){
            boFactory=new BOFactory();
        }
        return boFactory;
    }

    public SuperBO getBO(BOTypes boTypes){
        switch (boTypes){
            case PLAYERBO:
                return new ManagePlayerBOImpl();
            case BOOKINGBO:
                return new ManageBookingBOImpl();
            case COURTBO:
                return new ManageCourtBOImpl();
            case PAYMENTBO:
                return new ManagePaymentBOImpl();

            default:
                return null;
        }

    }
}
