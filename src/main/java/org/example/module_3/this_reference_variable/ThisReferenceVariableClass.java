package org.example.module_3.this_reference_variable;

public class ThisReferenceVariableClass {
    // age is global variable, part of object, instance variable
    int age;

    void printAge() {
        // local variable, variable method level
        int age = 30;
        System.out.println("Age is: "+ age);
        System.out.println("Age is: "+ this.age);
    }

    public static void main(String[] args) {
        ThisReferenceVariableClass obj = new ThisReferenceVariableClass();
        obj.age = 20;
        obj.printAge();

        ThisReferenceVariableClass obj2 = new ThisReferenceVariableClass();
        obj2.age = 60;
        obj2.printAge();
    }
}
