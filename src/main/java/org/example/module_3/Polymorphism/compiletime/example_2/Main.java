package org.example.module_3.Polymorphism.compiletime.example_2;

public class Main {
    public static void main(String[] args){
        calculator mycalc=new calculator();

        int a=10,b=20;
        System.out.println(mycalc.add(a,b));

        double c=10,d=50;
        System.out.println(mycalc.add(c,d));

        float e=9.2f,f=20.8f;
        System.out.println(mycalc.add(e,f));
    }
}
