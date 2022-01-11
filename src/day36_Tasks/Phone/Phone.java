package day36_Tasks.Phone;

public class Phone {

    public String brand;
    public String model;
    public String size;
    public int price;
    public String color;

    public void call(long phoneNumber){
        System.out.println(brand + " is calling");
    }
    public void text(long phoneNumber){
        System.out.println(brand + " is texting");
    }

    public void setInfo(String brand, String model, String size, int price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
1.1 Create a class named Phone:
        Variables:
        brand, model, size, price, color

        Methods:
        setInfo()
        call(long phoneNumber)
        text(long phoneNumber)
        toString()
        */
