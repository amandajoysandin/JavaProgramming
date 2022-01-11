package day30_CustomClass;

public class Employee {

    public String name;
    public int ID;
    public char gender;
    public String jobtitle;
    public int salary;
    public boolean isFullTime;


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", gender=" + gender +
                ", jobtitle='" + jobtitle + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }
    public void String(){
        System.out.println(name + " is coding");
    }
    public void sleep(){
        System.out.println(name + " is sleeping");
    }
}
