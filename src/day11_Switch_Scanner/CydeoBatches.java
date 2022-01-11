package day11_Switch_Scanner;

public class CydeoBatches {
    public static void main(String[] args) {
       /* 4. Create a class named Cydeo batches. In Cydeo we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.

        	If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        	If batch type is invalid, print "Invalid Btach"

        	Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */


//If Statement
        String batch = "USPM";
        boolean valid = (batch=="USAM" || batch=="USPM" || batch=="EUAM");


        if(valid){
            if(batch == "USAM"){
                System.out.println("Class times are 10-5 EST. M, T, Th, F.");
            }else if(batch == "USPM"){
                System.out.println("Class times are 7-10 EST. M, T, W, Th, S, S");
            }else{
                System.out.println("Class times are  10-5 EST. M, T, W, Th, F.");
            }
        }else{
            System.out.println("Invalid Batch");
        }
        System.out.println("-----------");

        //Switch Statement

        String batch2 = "USPM";
        String result2;

        switch (batch2){
            case "USAM":
                result2= "Class times are 10-5 EST. M, T, Th, F.";
                        break;
            case "USPM":
                result2 = "Class times are 7-10 EST. M, T, W, Th, S, S";
                        break;
            case "EUAM":
                result2 = "Class times are  10-5 EST. M, T, W, Th, F.";
                break;
            default:
                result2 = "Invalid Batch";
break;
        }
        System.out.println(result2);


        System.out.println("-------------");
// If and Switch


        String batch3 = "USPM";
        boolean valid2 = (batch3=="USAM" || batch3=="USPM" || batch3=="EUAM");
        String result3;


        if(batch3=="USAM" || batch3=="USPM" || batch3=="EUAM"){
            switch (batch3) {
                case "USAM":
                    result3 = "Class times are 10-5 EST. M, T, Th, F.";
                    break;
                case "USPM":
                    result3 = "Class times are 7-10 EST. M, T, W, Th, S, S";
                    break;
                default:
                    result3 = "Class times are  10-5 EST. M, T, W, Th, F.";
                break;
                 }
            System.out.println(result3);
        }else{
            System.out.println("Invalid Batch");
        }
        System.out.println("------------");


        String batch4 = "USPM";
        boolean valid4 = (batch4=="USAM" || batch4=="USPM" || batch4=="EUAM");
        String result4 = "";
if(valid4){
        switch (batch4){
            case "USAM":
                result4= "Class times are 10-5 EST. M, T, Th, F.";
                break;
            case "USPM":
                result4 = "Class times are 7-10 EST. M, T, W, Th, S, S";
                break;
            default:
                result4 = "Class times are  10-5 EST. M, T, W, Th, F.";
                break;
        }System.out.println(result4);
}else{
            System.out.println("Invalid Batch");}







}

}
