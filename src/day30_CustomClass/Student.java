package day30_CustomClass;

public class Student {
    //these are instance variables
    public String name;
    public char gender;
    public int age;
    public int ID;
    public char grade;

    //these are local variables
     public void setInfo(String name, char gender, int age, int ID, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
    }

    public void code(){
        System.out.println(name + " is coding");
    }
    public void sleep(){
        System.out.println(name + " is sleeping");
    }
}
/*Student Class:

    Attributes:
        name, gender, age, studentID

    Actions:
        eat(), sleep(), drink(), code()
        setInfo(): to set all the attributes of student object
        toString(): to print the full info of student*/