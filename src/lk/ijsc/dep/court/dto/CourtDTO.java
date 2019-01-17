package lk.ijsc.dep.court.dto;

public class CourtDTO {
    private int cid;
    private String town;
    private String name;

    public CourtDTO() {
    }

    public CourtDTO(int cid, String town, String name) {
        this.cid = cid;
        this.town = town;
        this.name = name;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Court{" +
                "cid=" + cid +
                ", town='" + town + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
