package org.example.module_3.Abstraction.AbstractClass.example2_Remote;

public class Test {
    public static void main(String[] args){
        Remote o1=new Ac();
        Remote o2=new Tv();
        //o1.turnon();
        //o2.turnoff();
        doWork(o1);
        doWork(o2);
    }
    public static void doWork(Remote obj){
        obj.turnon();
        obj.turnoff();
    }
}
