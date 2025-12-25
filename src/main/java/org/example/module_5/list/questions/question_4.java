package org.example.module_5.list.questions;
import java.util.ArrayList;

public class question_4 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");
        list.add("banana");
        System.out.println("list");
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            int count = 1;

            // Skip already counted elements
            if (list.get(i).equals("counted")) {
                continue;
            }

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    count++;
                    list.set(j, "counted");
                }
            }
//            System.out.println("frequnecy of elements");
            System.out.println(list.get(i) + " -> " + count);
        }
    }
}
