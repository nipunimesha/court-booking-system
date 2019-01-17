package lk.ijsc.dep.court.dto;

import java.sql.Date;
import java.sql.Time;

public class BookingDTO {
    private Time time;
    private Date date;
    private int bid;
    private int fnic;
    private int fcid;
    private int fpid;

    public BookingDTO(Time time, Date date, int bid, int fnic, int fcid, int fpid) {
        this.time = time;
        this.date = date;
        this.bid = bid;
        this.fnic = fnic;
        this.fcid = fcid;
        this.fpid = fpid;
    }

    public BookingDTO() {
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public int getFnic() {
        return fnic;
    }

    public void setFnic(int fnic) {
        this.fnic = fnic;
    }

    public int getFcid() {
        return fcid;
    }

    public void setFcid(int fcid) {
        this.fcid = fcid;
    }

    public int getFpid() {
        return fpid;
    }

    public void setFpid(int fpid) {
        this.fpid = fpid;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "time=" + time +
                ", date=" + date +
                ", bid=" + bid +
                ", fnic=" + fnic +
                ", fcid=" + fcid +
                ", fpid=" + fpid +
                '}';
    }
}
