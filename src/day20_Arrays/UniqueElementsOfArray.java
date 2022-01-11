package day20_Arrays;

public class UniqueElementsOfArray {
    public static void main(String[] args) {

        String[] words = {"Java", "Java", "C#", "Python", "Python"};

        for (int j = 0; j < words.length; j++) { //


            String element = words[0]; //"Java"
            int frequency = 0;
            for (int i = 0; i < words.length; i++) {//finds the frequency of the element from the array
                if (words[i].equals(element)) {
                    frequency++;
                }

            }
            if(frequency ==1 );
            System.out.println(element);

        }
    }
}
