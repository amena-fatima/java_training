package org.example.module_5.list;

import java.util.ArrayList;
import java.util.Collections;

public class sorting_array_list_collection {
    ArrayList<Integer> myArr1=new ArrayList<>();

    public static void main(String[] args) {
        sorting_array_list_collection obj = new sorting_array_list_collection();
        obj.addElement();
        System.out.println("original array");
        obj.printArray();
        System.out.println("sorting the array in ascending order");
        Collections.sort(obj.myArr1);
        obj.printArray();
    }
    public void addElement(){
        myArr1.add(5);
        myArr1.add(2);
        myArr1.add(8);
        myArr1.add(1);
        myArr1.add(4);
    }
    public void printArray(){
        System.out.println("printing array element");
        for(Integer num: myArr1){
            System.out.println(num +" ");
        }
        System.out.println();
    }
}
