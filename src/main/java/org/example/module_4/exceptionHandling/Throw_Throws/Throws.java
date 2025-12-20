package org.example.module_4.exceptionHandling.Throw_Throws;

public class Throws {
    public static void main(String[] args) {
        System.out.println("program started");
        try {
            myMethod();
        }catch(Exception e){
            System.out.println("Exception handled");
        }
        System.out.println("program ended");
    }
    static void myMethod() throws Exception{
            int a =10/0;
    }
}
