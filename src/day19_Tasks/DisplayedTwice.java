package day19_Tasks;

public class DisplayedTwice {
    public static void main(String[] args) {
        String str = "aabbcc";
        String result = "";


        for (int i = 0; i <str.length() ; i++) {//outer loop which means it runs the loop inside
                                                //so we dont have to write out every loop
            char cOuter = str.charAt(i); // Evaluate the char at each value of i
            int count =0;       // this is to count how many times a char appears in the string

            for (int j = 0; j < str.length(); j++) { //inner loop which will run until the length of the string
                char cInner = str.charAt(j); //Evaluate the char at each value of j
                if(cOuter==cInner) { //Evaluate whether the chars match, see if they have appeared in the string
                    count++; // if they have been duplicated, add 1 to the count
                }
            }
if(!result.contains(cOuter+"") && count==2){ //if the char is not in the result & it appeared twice
    result+=cOuter; // add it to the previously assigned result
}
        }
        System.out.println(result);

    }
}

/*3. Write a program that can display all the characters that appeared twice in the string.*/