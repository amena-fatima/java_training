package org.example.module_3.Abstraction.AbstractClass.example1_Myclass;

public class Test {
    public static void main(String[] args){
        //we cannot create object of abstract class
        //MyClass obj=new MyClass();
        //obj.myfunc();

        //UserClass1 obj=new UserClass1();
        //obj.myfunc();

        MyClass obj1=new UserClass1();
        obj1.myAbstractFunc();
        MyClass obj2=new UserClass2();
        obj2.myAbstractFunc();

    }
}
