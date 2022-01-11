package day19_Tasks;

public class IndexOfFirstUniqueChar {
    public static void main(String[] args) {
        String str = "aapoffg";


        for (int i = 0; i <str.length() ; i++) { //outer loop that will repeat inner loop for us
            char cOuter = str.charAt(i); //Evaluates the char at each value of i for the length of the string
            int count = 0; //declaring this to use later to count the number of times a char appears in the string

            for (int j = 0; j <str.length() ; j++) { //inner loop that will repeat for the length of the string
                char cInner = str.charAt(j); // Evaluates the char at each value of i for the length of the string

                if (cOuter == cInner) { //if the chars have appeared before
                    count++;   //increase the count for that char
                }
            }

            if(count==1){ //if the char only appears once
                    System.out.println(str.indexOf(cOuter)); //print the index of the char that first appears only once
                break;
                }




        }




    }
}

/*//4. Write a program that can return the index number of the first unique character.*/