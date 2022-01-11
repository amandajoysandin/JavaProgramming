package day34_GarbageCollection_AccessModifiers;

import java.util.concurrent.ScheduledExecutorService;

public class CydeoStudent {

    public String studentName;
    public static String schoolName;

    public CydeoStudent (String studentName){
        this.studentName = studentName;
    }


}

class CydeoStudentObject{

    public static void main(String[] args)  {

        CydeoStudent student1 = new CydeoStudent("Jimmy");
        CydeoStudent student2 = new CydeoStudent("Kathy");

        System.out.println("student1 = " + student1);
        System.out.println("student2 = " + student2);
    }
}