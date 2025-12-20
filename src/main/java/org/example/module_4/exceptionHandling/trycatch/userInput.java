package org.example.module_4.exceptionHandling.trycatch;
import java.util.Scanner;
public class userInput {
    public static void main(String[] args) {
        System.out.println("PRogram started");
        Scanner obj=new Scanner(System.in);

        String[] names={"Alice","Bob","Charles"};
        boolean run =true;
        do {
            System.out.println("Enter an index to access the name array");
            int index = obj.nextInt();
            try{
                System.out.println("name at index"+index+": "+names[index]);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Error: invalid index");
            }
            System.out.println("Do u want to continue?(true/false): ");
            run = obj.nextBoolean();
        }while(run);
        obj.close();
        System.out.println("program end");
    }
}
