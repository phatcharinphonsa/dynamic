package models;

public class tvmovie {
    private String name;//ชื่อ
    private String add;//ที่อยู่
    private String product;//ชื่อสินค้า
    private String number;//โทรเบอร์
    private int hd;//จอ
    private int install;//ติดตั้ง
    private int ass;//อุปกรณ์เสริม
    private int num;//จำนวน
    private int tarn;//บริการส่ง
    private int size;//ขนาด
    private int price;//มัดจำ
    private int discount;//ส่วนลด
    private int total,tax,i_discount,all;
    public tvmovie() {

    }

    public tvmovie(String name, String add, String product, String number, int hd,
                   int install, int ass, int num, int tarn, int size, int
                           price, int discount) {
        this.name = name;
        this.add = add;
        this.product = product;
        this.number = number;
        this.hd = hd;
        this.install = install;
        this.ass = ass;
        this.num = num;
        this.tarn = tarn;
        this.size = size;
        this.price = price;
        this.discount = discount;
        setAll();
        setTotal ();
        setTax ();
        setI_discount ();
    }

//setter
    public void setName (String name) {
        this.name = name;
    }

    public void setAdd (String add) {
        this.add = add;
    }

    public void setProduct (String product) {
        this.product = product;
    }

    public void setNumber (String number) {
        this.number = number;
    }

    public void setHd (int hd) {
        this.hd = hd;
    }

    public void setInstall (int install) {
        this.install = install;
    }

    public void setAss (int ass) {
        this.ass = ass;
    }

    public void setNum (int num) {
        this.num = num;
    }

    public void setTarn (int tarn) {
        this.tarn = tarn;
    }

    public void setSize (int size) {
        this.size = size;
    }

    public void setPrice (int price) {
        this.price = price;
        setAll();
        setTotal ();
        setTax ();
        setI_discount ();
    }

    public void setDiscount (int discount) {
        this.discount = discount;
        setAll();
        setTotal ();
        setTax ();
        setI_discount ();
    }

    private void setTotal () {

        total = num * (hd+install+ass+tarn+size);
        setI_discount ();
        setTax ();
    }

    private void setTax () {
        tax=total*7/100;
    }

    private void setI_discount () {

        i_discount=total*discount/100;
        setAll ();
    }

    private void setAll () {
        all=total-i_discount+tax-price;
    }



    //getter

    public String getName () {
        return name;
    }

    public String getAdd () {
        return add;
    }

    public String getProduct () {
        return product;
    }

    public String getNumber () {
        return number;
    }

    public int getHd () {
        return hd;
    }

    public int getInstall () {
        return install;
    }

    public int getAss () {
        return ass;
    }

    public int getNum () {
        return num;
    }

    public int getTarn () {
        return tarn;
    }

    public int getSize () {
        return size;
    }

    public int getPrice () {
        return price;
    }

    public int getDiscount () {
        return discount;
    }

    public int getTotal () {
        return total;
    }

    public int getI_discount () {
        return i_discount;
    }

    public int getTax () {
        return tax;
    }

    public int getAll () {
        return all;
    }
}

