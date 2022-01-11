package day09_IfStatements;

public class GradeReport {

    /*
     grade report ==> A, B, C, D, F


     char grade
     */

    public static void main(String[] args) {

        int score = 75 ;
        char grade;

        if (score >= 90) {
            grade = 'A';
        }else if(score >=80) {
            grade = 'B';
        }else if(score >= 70){
            grade = 'C';
        }else if (score >=60) {
            grade = 'D';
        }else{
            grade = 'F';
            }
        System.out.println(grade);

    }




    }

