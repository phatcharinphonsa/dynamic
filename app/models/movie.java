package models;
import play.db.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "tv")
public class movie extends Model {
    @Id
    private String id;
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

    public movie() {
    }

    public movie(String id, String name, String address, String pduct, String number,
                 String screen, String scale, String fin, String hds,
                 String party, String land, String pmoney, String discount) {
        this.id = id;
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
    public void setId(String id) {
        this.id = id;
    }

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
    public String getId() {
        return id;
    }

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

    ////////////////////////////////////////
    public static Model.Finder<String, movie> find = new Model.Finder<String, movie>(String.class, movie.class);

    public static void create(movie auto) {

        auto.save();
    }

    public static List<movie> retrieve() {

        return find.all();
    }

    public static List<movie> retrieveAddress(String address) {

        return find.where().eq("address", address).findList();
    }

    public static List<movie> retrieveID(String id) {

        return find.where().eq("id", id).findList();
    }

    public static List<movie> retrieveLand(String land) {

        return find.where().eq("land", land).findList();
    }


    public static void update(movie auto) {

        auto.update();
    }

    public static void delete(movie auto) {

        auto.delete();
    }
}
