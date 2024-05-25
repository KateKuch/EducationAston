package task4;

import java.util.Scanner;

public class DuplicateOfChar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine(), duplicateLine = "";

        for(char c : line.toCharArray()){
            duplicateLine = duplicateLine + Character.toString(c) + Character.toString(c);
        }

        System.out.println("Получившаяся строка: " + duplicateLine);
    }
}
