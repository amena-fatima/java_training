package org.example.module_3.Polymorphism.runtime.example_1;


public class main {
    public static void main(String[] args){

        parent obj1=new subClass1();
        parent obj2=new subClass2();

        obj1.myfunc();
        obj2.myfunc();

    }

}
