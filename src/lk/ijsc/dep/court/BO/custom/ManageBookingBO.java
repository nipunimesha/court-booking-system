package lk.ijsc.dep.court.BO.custom;

import lk.ijsc.dep.court.BO.SuperBO;
import lk.ijsc.dep.court.dto.BookingDTO;
import lk.ijsc.dep.court.dto.PlayerDTO;
import lk.ijsc.dep.court.entity.Booking;

import java.util.ArrayList;

     public interface ManageBookingBO extends SuperBO {
     public boolean saveBooking(BookingDTO bookingDTO)throws Exception;
     public boolean updateBooking(BookingDTO bookingDTO)throws Exception;
     public boolean deleteBooking(int bid ) throws Exception;
     public BookingDTO find (int bid) throws Exception;
     ArrayList<BookingDTO> findAll()throws Exception;


}
