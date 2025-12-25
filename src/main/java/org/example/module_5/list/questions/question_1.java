package org.example.module_5.list.questions;
import java.util.*;

public class question_1 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);

        System.out.println("list");
        System.out.println(list);

        Set<Integer> set = new LinkedHashSet<>(list);
        System.out.println("list after removing duplicates");
        System.out.println(set);
    }
}
