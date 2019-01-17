package lk.ijsc.dep.court.BO.custom.impl;

import lk.ijsc.dep.court.BO.custom.ManageBookingBO;
import lk.ijsc.dep.court.dao.DAOFactory;
import lk.ijsc.dep.court.dao.custom.BookingDAO;
import lk.ijsc.dep.court.dto.BookingDTO;
import lk.ijsc.dep.court.entity.Booking;

import java.util.ArrayList;

public class ManageBookingBOImpl implements ManageBookingBO {

    BookingDAO bookingDAO = (BookingDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.BOOKING);

    @Override
    public boolean saveBooking(BookingDTO bookingDTO) throws Exception {
        Booking booking = new Booking(bookingDTO.getTime(),bookingDTO.getDate(),bookingDTO.getBid(),bookingDTO.getFnic(),bookingDTO.getFcid(),bookingDTO.getFpid());
        return bookingDAO.save(booking);
    }

    @Override
    public boolean updateBooking(BookingDTO bookingDTO) throws Exception {
        Booking booking = new Booking(bookingDTO.getTime(),bookingDTO.getDate(),bookingDTO.getBid(),bookingDTO.getFnic(),bookingDTO.getFcid(),bookingDTO.getFpid());
        return bookingDAO.update(booking);
    }

    @Override
    public boolean deleteBooking(int bid) throws Exception {
        return bookingDAO.delete(bid);
    }

    @Override
    public BookingDTO find(int bid) throws Exception {
        Booking booking = bookingDAO.find(bid);
        BookingDTO booking1 = new BookingDTO(booking.getTime(),booking.getDate(),booking.getBid(),booking.getFnic(),booking.getFcid(),booking.getFpid());
        return booking1;
    }

    @Override
    public ArrayList<BookingDTO> findAll() throws Exception {
        ArrayList <BookingDTO> arrayList = new ArrayList <>();
        ArrayList <Booking> arrayList1 = bookingDAO.findAll();
        for (Booking booking : arrayList1) {
            BookingDTO booking1 = new BookingDTO(booking.getTime(),booking.getDate(),booking.getBid(),booking.getFnic(),booking.getFcid(),booking.getFpid());
            arrayList.add(booking1);
        }
        return arrayList;
    }
}
