package lk.ijsc.dep.court.entity;

public class Player extends SuperEntity {

    private int nic;
    private String name;
    private String address;
    private int contact;

    public Player() {
    }

    public Player(int nic, String name, String address, int contact) {
        this.nic = nic;
        this.name = name;
        this.address = address;
        this.contact = contact;
    }

    public int getNic() {
        return nic;
    }

    public void setNic(int nic) {
        this.nic = nic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Player{" +
                "nic=" + nic +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contact=" + contact +
                '}';
    }
}
