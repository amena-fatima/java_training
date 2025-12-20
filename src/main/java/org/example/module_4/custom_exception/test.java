package org.example.module_4.custom_exception;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("program started");
        try {
            takeUserInputAndValidate();
        } catch (Myexception e) {
            System.out.println("My custom Exception throw handled msg: " + e.getMessage());
        }
        System.out.println("program ended");
    }

public static void takeUserInputAndValidate() {

    Scanner sc = new Scanner(System.in);
    System.out.println("enter age");
    int age = sc.nextInt();

    if (age<18){
        throw new Myexception("user is minor");
    }

    else if(age > 30 && age < 60){
        System.out.println("user is young");
    }
    else{
        System.out.println("user is senior citizen");
    }
    sc.close();
}

}
