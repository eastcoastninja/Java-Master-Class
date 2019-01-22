package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner;

    public static void main(String[] args) {
        Animal animal =  new Animal("animal", 1, 1, 5, 5);

        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");

        dog.eat("pizza");
//        dog.walk();
        dog.run();

        scanner = new Scanner(System.in);


    }

    public static void input(String userInput) {
        System.out.println("insert stuff" + userInput);
        String readIn = scanner.nextLine();
    }
}
