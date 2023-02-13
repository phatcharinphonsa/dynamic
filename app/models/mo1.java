package models;

import play.db.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "mo1")
public class mo1 extends Model {
    @Id
    private String id;
    private String namepro;
    private String num;
    private String scale;
    private String gen;
    private String color;
    private String intall;
    private String status;

    @OneToMany(mappedBy = "mo")
    List<Sale> saleList =new ArrayList<Sale>();

    public mo1 () {
    }

    public mo1 (String id, String namepro, String num, String scale, String gen, String color, String intall, String status) {
        this.id = id;
        this.namepro = namepro;
        this.num = num;
        this.scale = scale;
        this.gen = gen;
        this.color = color;
        this.intall = intall;
        this.status = status;
    }

    //setter

    public void setId (String id) {
        this.id = id;
    }

    public void setNamepro (String namepro) {
        this.namepro = namepro;
    }

    public void setNum (String num) {
        this.num = num;
    }

    public void setScale (String scale) {
        this.scale = scale;
    }

    public void setGen (String gen) {
        this.gen = gen;
    }

    public void setColor (String color) {
        this.color = color;
    }

    public void setIntall (String intall) {
        this.intall = intall;
    }

    public void setStatus (String status) {
        this.status = status;
    }


    //getter


    public String getId () {
        return id;
    }

    public String getNamepro () {
        return namepro;
    }

    public String getNum () {
        return num;
    }

    public String getScale () {
        return scale;
    }

    public String getGen () {
        return gen;
    }

    public String getColor () {
        return color;
    }

    public String getIntall () {
        return intall;
    }

    public String getStatus() {
        return status;
    }

    public List<Sale> getSaleList(){
        return saleList;
    }

    ///////////////////////////////
    public static Model.Finder<String,mo1> find=new Model.Finder<String,mo1>(String.class,mo1.class);

    public static void create(mo1 auto){

        auto.save();
    }

    public static List<mo1> retrieve(){

        return find.all();
    }

    public static void update(mo1 auto){

        auto.update();
    }

    public static void delete(mo1 auto){

        auto.delete();
    }

}