package models;

public class Movi {
    private String name;//ชื่อ
    private String address;//อาชีพ
    private String pduct;//บัตรประชาชน
    private String number;//โทรเบอร์
    private String screen;//ชั้นบ้าน
    private String scale;//ห้องนั้งเล่น
    private String fin;//ห้องนอน
    private String hds;//ห้องน้ำ
    private String party;//ที่จอดรถ
    private String land;//ที่ดิน
    private String pmoney;//มัดจำ
    private String discount;//ส่วนลด
    public Movi() {
    }
    public Movi( String name, String address, String pduct, String number,
                  String screen, String scale, String fin, String hds,
                  String party, String land, String pmoney, String discount) {
        this.name = name;
        this.address = address;
        this.pduct = pduct;
        this.number = number;
        this.screen = screen;
        this.scale = scale;
        this.fin = fin;
        this.hds = hds;
        this.party = party;
        this.land = land;
        this.pmoney = pmoney;
        this.discount = discount;
    }

    //setter

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPduct(String pduct) {
        this.pduct = pduct;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public void setHds(String hds) {
        this.hds = hds;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public void setPmoney(String pmoney) {
        this.pmoney = pmoney;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }


    //getter

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPduct() {
        return pduct;
    }

    public String getNumber() {
        return number;
    }

    public String getScreen() {
        return screen;
    }

    public String getScale() {
        return scale;
    }

    public String getFin() {
        return fin;
    }

    public String getHds() {
        return hds;
    }

    public String getParty() {
        return party;
    }

    public String getLand() {
        return land;
    }

    public String getPmoney() {
        return pmoney;
    }

    public String getDiscount() {
        return discount;
    }

    private void save () {
    }
    private void update () {
    }
}
