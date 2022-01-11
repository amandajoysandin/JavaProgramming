package day05_Concatenation;

public class ShippingAddress {

    /* Create a class called ShippingAddress.java
Declare the following variables:
name
buildingNumber
streetName
city
state
zipCode

Use concatenation to print the full shipping address
Amanda Sandin
11821B White Road
Tampa, Florida 22314*/

    public static void main(String[] args) {
        String name = "Amanda Sandin",
                buildingNumber = "11821B",
                streetName = "White Road",
                city = "Tampa",
                state = "Florida",
                zipCode = "22314";
        String address = name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + zipCode;
        System.out.println(address);








    }







}
