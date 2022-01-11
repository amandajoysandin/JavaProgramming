package day14_String;

public class EmailDomain {
    public static void main(String[] args) {

        String email = "Cydeo.School@gmail.com";

        String domain = email.substring(email.indexOf("@"), email.lastIndexOf(".") );
        String s2 = email.substring(0, email.indexOf("."));

        System.out.println(domain);

        System.out.println("-------------");

        String str1 = "Java is fun, Java is cool, I love Java";
        //             012345...

        String s3 = str1.substring(0, 10+1) ; //Java is fun
        int beg = str1.indexOf("J")+1;
        int end = str1.lastIndexOf(",");

        String s4 = str1.substring(beg-1, end ); //Java is fu

        String s5 = str1.substring(str1.lastIndexOf("I"));
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);




    }

}
