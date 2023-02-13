package controllers;
import com.avaje.ebean.Page;
import models.*;
import play.api.templates.Html;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.*;

import views.html.*;

import java.util.ArrayList;
import java.util.List;

public class Application extends Controller {
    public static tvmovie tvmovie;
    public static Form<tvmovie> tvmovieForm = Form.form(tvmovie.class);
    public static List<tvmovie> ListTvmovie = new ArrayList<tvmovie>();


    public static Result index() {
        return ok(index.render("Hello world"));
    }

    public static Result start(){
        return air1(start.render());
    }

    public static Result test(){
            productshow mycom = new productshow("NH.QD9ST.001","Acer","Nitro 5 AN515-57-74ZT"
                    ,"Black","RAM 16GB DDR4, SSD 512GB PCIe NVMe","Windows 10 Home 64-bit",
                    "11th Generation Intel® Core™ i7-11800H","NVIDIA GeForce® RTX™ 3050Ti (4GB GDDR6)",5,39900,300);

            productshow mycomteter= new productshow("4711081249023","Asus","TUF Gaming F15 FX506HM-HN008T"
                    ,"Eclipse Grey","16 GB DDR4 2933 MHz","Windows 10 Home 64-bit",
                    "Intel Core i5-11400H","GeForce RTX 3060Ti",10,38800,300);

            return air1(test.render(mycom,mycomteter));
    }

    public  static  Result home(){
        return ok(home.render());

    }

    public static Result air1(Html content){
        return ok(air1.render(content));
    }

    public static Result meme(){
        resume myre = new resume("Rajamangala University of Technology Isan Khon Kaen Campus","Business Administration and Information Technology"
                , "Information Technology","3","62342110117-1"
                ,"Phatcharinphon Saowiang","Bew","140990291XXX","19/03/2543","Thai",43,158
                ,"Nong Phai","Chum Phae","Khon kaen",40130,"Patcharin Bew","phatcharinphon.sa@rmuti.ac.th");

        return air1(meme.render(myre));
    }

    public  static Result product () {
        String id1 = "CDS31077484";
        String name1 = "XIAOMI เครื่องฟอกอากาศ Air Purifier 3H ";
        int price1 = 6990;
        String detalls1 = "XIAOMI เครื่องฟอกอากาศ Air Purifier 3H รุ่น FJY4031GL สีขาว \n" +
                "เหมาะกับใช้งานในพื้นที่ 28-48 ตารางเมตร\n" +
                "กำลังไฟ 38 วัตต์ แรงดันไฟฟ้า 100-240 โวลต์\n" +
                "รองรับเชื่อมต่อผ่าน Mi Home App เพิ่มการรองรับการสั่งงานด้วย Google Assistant และ Alexa\n" +
                "ปรับระดับความแรงลม และปรับโหมดได้โดยไม่ต้องผ่านสมาร์ทโฟน พร้อมอ่านและตรวจเช็คค่า AQI ได้แบบเรียลไทม์";
        String promotion1 = "29%";
        int insu1 = 3;
        String status1 = "พร้อมส่ง";
        int a = (6990 * 29) / 100;
        int total1 = 6990 - a;


        String id2 = "CDS70073577";
        String name2 = "XIAOMI เครื่องฟอกอากาศ Air Purifier 3C EU ";
        int price2 = 4590;
        String detalls2 = "XIAOMI เครื่องฟอกอากาศ Air Purifier 3C EU (Global Version) เปลี่ยนห้องของคุณให้เป็นห้องที่น่าอยู่กว่าเดิมด้วยเครื่องฟอกอากาศจากแบรนด์ MI มาพร้อมกับรุ่นใหม่ที่ออกแบบมาให้มีคุณสมบัติที่พิเศษกว่าเดิม ตอบโจทย์ทุกคนอย่างแน่นอน\n" +
                "\n" +
                "การควบคุมที่สะดวกด้วย Mi Home APP\n" +
                "กำหนดเวลาเปิด / ปิดการควบคุมโดยผู้ปกครอง";
        String promotion2 = "19%";
        int insu2 = 1;
        String status2 = "พร้อมส่ง";
        int b = (4590 * 19) / 100;
        int total2 = 4590 - b;

        return air1(product.render(id1, name1, price1, detalls1, promotion1, insu1, status1, total1, id2, name2, price2, detalls2, promotion2, insu2, status2, total2));

    }
    public static Result lab7(){

        return air1(lab7.render());
    }

    public static Result getLab7(){
        DynamicForm Myhome = Form.form().bindFromRequest();
        String name = Myhome.get("name");
        String add = Myhome.get("add");
        String product = Myhome.get("product");
        String number = Myhome.get("number");
        int hd = Integer.parseInt(Myhome.get("hd"));
        int install = Integer.parseInt(Myhome.get("install"));
        int ass = Integer.parseInt(Myhome.get("ass"));
        int num = Integer.parseInt(Myhome.get("num"));
        int tarn = Integer.parseInt(Myhome.get("tarn"));
        int size = Integer.parseInt(Myhome.get("size"));
        int price = Integer.parseInt(Myhome.get("price"));
        int discount = Integer.parseInt(Myhome.get("discount"));
        tvmovie tv = new tvmovie(name,add,product,number,hd,install,ass,num,tarn,size,price,discount);
        return air1(lab7show.render(tv));
    }

    public static Result lab8(){
        tvmovieForm = Form.form(tvmovie.class);
        return air1(lab8.render(tvmovieForm));
    }
    public static Result getLab8(){
        Form<tvmovie> newForm = tvmovieForm.bindFromRequest();
        if(tvmovieForm.hasErrors()){
            return air1(lab8.render(newForm));
        }else {
            tvmovie = newForm.get();

            return air1(lab8show.render(tvmovie));
        }

    }
    public static Result lab9(){
        return air1(lab9.render(tvmovieForm));
    }
    public static Result getLab9() {
        Form <tvmovie> newForm = tvmovieForm.bindFromRequest();
        if(tvmovieForm.hasErrors()){
            return air1(lab9.render(newForm));
        }else {
            tvmovie = newForm.get();
            ListTvmovie.add(tvmovie);
            return lab9show();
        }
    }
    public static Result lab9show(){
        return air1(lab9show.render(ListTvmovie));

    }

    public static List<movie> movieList1 = new ArrayList();
    public static List<movie> movieList2 = new ArrayList();
    public static List<movie> movieList3 = new ArrayList();
    public static List<movie> movieList4 = new ArrayList();

    public static Result lab10show () {
        movieList1 = movie.retrieveAddress("Khon Kaen");
        movieList2 = movie.retrieveID("VP001");
        movieList3 = movie.retrieveLand("Shipped");
        movieList4 = movie.retrieve();
        return air1(lab10show.render(movieList1, movieList2, movieList3,movieList4));
    }
    public static Form<Movies> NewMovies = Form.form(Movies.class);

    public static Result lab11 () {
        return air1(lab11.render(NewMovies));
    }

    public static Result getLab11 () {
        Form<Movies> neMovies= NewMovies.bindFromRequest();
        if (neMovies.hasErrors()) {
            NewMovies = neMovies;
            return lab11();
        } else {
            Movies newMovi = neMovies.get();

            Movies obj = Movies.find.byId(newMovi.getId());
            if (obj != null) {
                flash("msgError", "รหัสซ้ำ");
                NewMovies = neMovies;
                return lab11();
            }
            Movies.create(newMovi);
            return lab11show();

        }

    }
    public static List<Movies> MoviesList1 = new ArrayList();

    public static Result lab11show () {
        MoviesList1 = Movies.retrieve();
        return air1(lab11show.render(MoviesList1));
    }

    public static Result lab11update (String id) {
        Movies EditMovi = Movies.find.byId(id);
        NewMovies = Form.form(Movies.class).fill(EditMovi);
        return air1(lab11update.render(NewMovies));
    }

    public static Result getLab11update () {
        Form<Movies> UpdateMovies = NewMovies.bindFromRequest();
        if (UpdateMovies.hasErrors()) {
            NewMovies = UpdateMovies;
            return air1(lab11update.render(NewMovies));
        } else {
            Movies UpdateMovi = UpdateMovies.get();
            Movies.update(UpdateMovi);
            return lab11show();

        }
    }
    public static Result lab11delete(String id) {
        Movies DeleteMovi = Movies.find.byId(id);
        if (DeleteMovi != null) {
            Movies.delete(DeleteMovi);
        }
        return lab11show();

    }
    public static Form<models.Sale> SaleForm = Form.form(Sale.class);
    public static List<mo1> mo1List = new ArrayList<mo1>();
    public static Page<Sale> salePage;


    public static Result showPageLab12(int n){
        salePage = Sale.find_5(n);
        return air1(lab12show.render(salePage));
    }

    public static Result inputLab12 () {
        mo1List = mo1.retrieve();
        return air1(inputLab12.render(SaleForm, mo1List));
    }

    public static Result getInputLab12 () {
        Form<Sale> inputSale = SaleForm.bindFromRequest();
        if (inputSale.hasErrors()) {
            SaleForm = inputSale;
            return inputLab12();
        } else {
            Sale newSale = inputSale.get();

            Sale obj = Sale.find.byId(newSale.getId_sale());
            if (obj != null) {
                flash("msgError", "รหัสซ้ำ");
                SaleForm = inputSale;
                return inputLab12();
            }
            Sale.create(newSale);
            return air1(lab12show.render(salePage));

        }

    }

    public static List<Sale> SaleList1 = new ArrayList();

    public static Result lab12update (String id_sale) {
        Sale EditSale= Sale.find.byId(id_sale);
        SaleForm = Form.form(Sale.class).fill(EditSale);
        return air1(lab12update.render(SaleForm,mo1List));
    }

    public static Result getLab12update () {
        Form<Sale> UpdateSale = SaleForm.bindFromRequest();
        if (UpdateSale.hasErrors()) {
            SaleForm = UpdateSale;
            return air1(lab12update.render(SaleForm,mo1List));
        } else {
            Sale updateMo = UpdateSale.get();
            Sale.update(updateMo);
            return air1(lab12show.render(salePage));

        }
    }
    public static Result DeleteLab12(String id_sale){
        Sale DeleteSale= Sale.find.byId(id_sale);
        if (DeleteSale != null) {
            Sale.delete(DeleteSale);
        }
        return air1(lab12show.render(salePage));
    }

}
