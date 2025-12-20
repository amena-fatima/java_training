package org.example.module_4.exceptionHandling.trycatch;

public class Basic {
    public static void main(String[] args) {
        System.out.println("Program started");

        int result=0;
        System.out.println("Dividing 10 by 0 ");

        try{
            result=10/0;
        } catch(Exception obj){
            System.out.println("An exception occured");
            System.out.println(obj.getMessage());
        }finally {
            System.out.println("This block is always executed");
        }
        System.out.println("printing result: "+ result);
        System.out.println("Program ended");

    }
}
