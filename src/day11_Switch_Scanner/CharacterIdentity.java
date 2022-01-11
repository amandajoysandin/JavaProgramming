package day11_Switch_Scanner;



public class CharacterIdentity {
    public static void main(String[] args) {
  /*Create a class called Character Identity, and
  write a program that can identify if the given character is a
  digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character

		HINT: You may wanna check out the numbers of the chracters on ASCII table*/

char ch =133;
if(ch >=1 && ch <=47) {
    System.out.println("Special Character");
}else if(ch >=48 && ch <=57) {
    System.out.println("Numerical Digit");
}else if(ch >=58 && ch <=64) {
    System.out.println("Special Character");
}else if(ch >=65 && ch <=90) {
    System.out.println("Capital Letter");
}else if(ch >=91 && ch <=96){
        System.out.println("Special Character");
    }else if(ch >=97 && ch <=122) {
    System.out.println("Lowercase Letter");
}else{
    System.out.println("Special Character");}





    }
}
