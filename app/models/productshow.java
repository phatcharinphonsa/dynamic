
package models;
public class productshow {
    public String number;
    public String  brand=null;
    public String model=null;
    public String color;
    public String ram;
    public String os;
    public String cpu;
    public String Storage;
    public int discountRate;
    public  double price, discount,net,ems,tax,next;

    public productshow() {
    }

    public productshow(String number, String brand, String model, String color, String ram, String os, String cpu, String storage, int discountRate, double price , double next) {
        this.number = number;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.ram = ram;
        this.os = os;
        this.cpu = cpu;
        Storage = storage;
        this.discountRate = discountRate;
        this.price = price;
        this.next = next;
        this.ems = ems;
        this.tax = tax;
        setNet();
        setDiscount();


    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;

        }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
        }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getStorage() {
        return Storage;
    }

    public void setStorage(String storage) {
        Storage = storage;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public double getNext(){return next;}
    public void setNext(double next){
        this.next = next;

    }

    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        this.price = price;
        setNet();
    }

    public double getDiscount() {
        return discount;
    }

    private void setDiscount() {
        discount = price*(discountRate/100.00);
    }

    public double getNet() {
        return net;
    }

    private void setNet() {
        net = price - (price*(discountRate/100.00));
        setEms();
        setTax();
    }
    public double getEms() {
        return ems;
    }

    private void setEms(){
        ems = tax + next;
    }
    public double getTax() {
        return tax;
    }

    private void setTax(){
        tax = net + (net * 0.03);
        setEms();
    }

}


