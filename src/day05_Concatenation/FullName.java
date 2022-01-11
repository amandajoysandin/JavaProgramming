package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {
        String firstName = "Cybertek";
        String lastName = "School";
        int age = 45;
        String jobTitle = "SDET";
        String companyName = "Apple Inc.";
        int salary = 105000;

        String fullName = firstName +" "+ lastName;


        /*Full name of the person is...*/
        System.out.println("The full name of the person is " + fullName +"");
/* ... is  ... years old*/
        System.out.println(fullName + " is " + age + " years old.");
        /*fullName is JobTitle, works at ..., and fullName's salary is...*/
        System.out.println(fullName + " is " + jobTitle + ", works at " + companyName
        + " and, " + fullName + "'s salary is $" + salary + ".");

            }


}
