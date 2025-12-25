package org.example.module_5.list.questions;
import java.util.*;
public class question_3 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Spring");
        list.add("SQL");
        System.out.println("original list");
        System.out.println(list);

        ArrayList<String> reversed = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }
        System.out.println("list after reversing");
        System.out.println(reversed);
    }
}
