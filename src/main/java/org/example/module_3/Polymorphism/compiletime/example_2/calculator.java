package org.example.module_3.Polymorphism.compiletime.example_2;

public class calculator {
    public int add(int a,int b){
        System.out.println("method with int type parameter called");
        return a+b;
    }
    public double add(double a,double b){
        System.out.println("method with double type parameter called");
        return a+b;
    }
    public float add(float a,float b){
        System.out.println("method with float type parameter called");
        return a+b;
    }
}

