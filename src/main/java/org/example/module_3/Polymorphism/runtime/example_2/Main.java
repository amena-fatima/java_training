package org.example.module_3.Polymorphism.runtime.example_2;

public class Main {
    public static void main(String[] args){
        animal obj1=new dog();
        animal obj2=new cat();

        obj1.makesound();
        obj2.makesound();
    }
}
