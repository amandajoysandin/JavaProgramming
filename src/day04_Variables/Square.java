package day04_Variables;

public class Square {

    public static void main(String[] args) {
        double sideLength = 4;
        int numberOfSides = 4;
        double area = sideLength * sideLength;
        double perimeter = numberOfSides * sideLength;
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);
    }


}

/*Create a class named Square, write a program that can calculate the area & perimeter of any given square
                        side

                        area = side * side;
                        perimeter = 4 * side*/