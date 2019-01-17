package lk.ijsc.dep.court.dto;

public class PaymentDTO {
    private int pid;
    private Double price;
    private int hours;

    public PaymentDTO() {
    }

    public PaymentDTO(int pid, Double price, int hours) {
        this.pid = pid;
        this.price = price;
        this.hours = hours;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "pid=" + pid +
                ", price=" + price +
                ", hours=" + hours +
                '}';
    }
}
