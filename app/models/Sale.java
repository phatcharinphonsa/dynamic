package models;
import com.avaje.ebean.Page;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name="sales")
public class Sale extends Model {
    @Id
    private String id_sale;
    private String name;
    private String tele;
    private String address;
    private String dep;
    @ManyToOne
    private mo1 mo;

    public Sale () {
    }

    public Sale (String id_sale, String name, String tele, String address, String dep, mo1 mo) {
        this.id_sale = id_sale;
        this.name = name;
        this.tele = tele;
        this.address = address;
        this.dep = dep;
        this.mo = mo;
    }
    //setter
    public void setId_sale (String id_sale) {
        this.id_sale = id_sale;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setTele (String tele) {
        this.tele = tele;
    }

    public void setAddress (String address) {
        this.address = address;
    }

    public void setDep (String dep) {
        this.dep = dep;
    }

    public void setMo (mo1 mo) {
        this.mo = mo;
    }

    //getter

    public String getId_sale () {
        return id_sale;
    }

    public String getName () {
        return name;
    }

    public String getTele () {
        return tele;
    }

    public String getAddress() {
        return address;
    }

    public String getDep () {
        return dep;
    }

    public mo1 getMo () {
        return mo;
    }


    //DB
    public static Model.Finder<String,Sale> find=new Model.Finder<String,Sale>(String.class,Sale.class);

    public static Page<Sale> find_5(int n){
        return  find.where()
                .orderBy("id_sale")
                .findPagingList(5)
                .setFetchAhead(false)
                .getPage(n-1);
    }
    public static List<Sale> retrieve_all(){
        return find.all();
    }

    public static void create(Sale auto){

        auto.save();
    }
    public static void update(Sale auto){

        auto.update();
    }

    public static void delete(Sale auto){

        auto.delete();
    }

}