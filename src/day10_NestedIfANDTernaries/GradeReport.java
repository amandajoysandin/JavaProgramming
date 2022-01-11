package day10_NestedIfANDTernaries;

public class GradeReport {

    public static void main(String[] args) {


        /*90`100: Excellent
        80~90: Great
        70~79: Good
        60~69: Passed
        0~59: Failed
        * */

        int score = 33;
        char grade;
        String result = ""; //temporary

        if(score >= 0 && score<=100) {
            if (score >= 90) {
                System.out.println("Excellent");
            } else if (score >= 80) {
                System.out.println("Great");
            } else if (score >= 70) {
                System.out.println("Good");
            } else if (score >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        }else{
            System.out.println("invalid score");}
















    }
}
