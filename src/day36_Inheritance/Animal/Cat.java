package day36_Inheritance.Animal;

public class Cat extends Animal{ //Cat is an Animal

    public void meow(){
        System.out.println(name + " is meowing");
    }
    public void scratch(){
        System.out.println(name + " is scratching");
    }
}
