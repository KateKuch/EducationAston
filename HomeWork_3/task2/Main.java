package task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String lineOne = sc.nextLine(), lineTwo = sc.nextLine(), lineThree = sc.nextLine();

        double average = (lineOne.length() + lineTwo.length() + lineThree.length())/3;

        System.out.println("Средний размер строки: " + average);

        if (lineOne.length() < average){
            System.out.println(lineOne + " Размер строки: " + lineOne.length());
        }
        if (lineTwo.length() < average){
            System.out.println(lineTwo + " Размер строки: " + lineTwo.length());
        }
        if (lineThree.length() < average){
            System.out.println(lineThree + " Размер строки: " + lineThree.length());
        }
    }
}
