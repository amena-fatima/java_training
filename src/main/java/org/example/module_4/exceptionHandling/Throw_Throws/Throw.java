package org.example.module_4.exceptionHandling.Throw_Throws;
import java.util.Scanner;
public class Throw {
    public static void main(String[] args) {
        System.out.println("Program started");

        try {
            takeUserInputAndValidate();
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println("program ended");
    }

    public static void takeUserInputAndValidate() {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter age");
        int age = sc.nextInt();

        if (age<18){
            //we are explicitly throwing an exception
            throw new IllegalArgumentException("user is minor");
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
