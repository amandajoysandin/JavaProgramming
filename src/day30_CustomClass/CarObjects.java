package day30_CustomClass;



import java.util.ArrayList;

public class CarObjects {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setInfo("Toyota", "Prius", "Black", 2021, 20000);
        System.out.println(car1);

        Car car2 = new Car();
        car2.setInfo("GMC", "Terrain", "Blue", 2022, 37500);
        System.out.println(car2);

        Car car3 = new Car();
        car3.setInfo("Chevy", "Cruze", "White", 2021, 43000);
        System.out.println(car3);
    }}
        // Car[] cars = { car1, car2, car3}; //instead of an array we need an array list in case we need to add different cars
/*
        ArrayList<Car> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(car1, car2, car3));

        for (Car: carsList) {
            System.out.println(each.brand + " : " + each.price);

        }
    }

}
*/