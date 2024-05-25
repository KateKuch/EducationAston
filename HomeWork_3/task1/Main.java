package task1;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        String lineOne = sc.nextLine(), lineTwo = sc.nextLine(), lineThree = sc.nextLine();

        ThreeLines lines = new ThreeLines(lineOne, lineTwo, lineThree);

        if (lines.shortestLine() == 1){
            System.out.println("Самая короткая строка: \"" + lineOne + "\". Количество символов: " + lineOne.length() + ".");
        } else if (lines.shortestLine() == 2){
            System.out.println("Самая короткая строка: \"" + lineTwo + "\". Количество символов: " + lineTwo.length() + ".");
        } else if (lines.shortestLine() == 3){
            System.out.println("Самая короткая строка: \"" + lineThree + "\". Количество символов: " + lineThree.length() + ".");
        } else if (lines.shortestLine() == -3){
            System.out.println("Самые короткие строки: \"" + lineOne + "\" и " + "\"" + lineTwo+ "\". Количество символов: " + lineOne.length() + ".");
        } else if (lines.shortestLine() == 4){
            System.out.println("Самые короткие строки: \"" + lineOne + "\" и " + "\"" + lineThree+ "\". Количество символов: " + lineOne.length() + ".");
        } else if (lines.shortestLine() == 5){
            System.out.println("Самые короткие строки: \"" + lineTwo + "\" и " + "\"" + lineThree + "\". Количество символов: " + lineTwo.length() + ".");
        }else if (lines.shortestLine() == 6){
            System.out.println("Все строки \"" + lineOne + "\", \"" + lineTwo + "\" и \"" + lineThree + "\" однаковой длины. Количество символов: " + lineOne.length() + ".");
        }

        if (lines.longestLine() == 1){
            System.out.println("Самая длинная строка: \"" + lineOne + "\". Количество символов: " + lineOne.length() + ".");
        } else if (lines.longestLine() == 2){
            System.out.println("Самая длинная строка: \"" + lineTwo + "\". Количество символов: " + lineTwo.length() + ".");
        } else if (lines.longestLine() == 3){
            System.out.println("Самая длинная строка: \"" + lineThree + "\". Количество символов: " + lineThree.length() + ".");
        } else if (lines.longestLine() == -3){
            System.out.println("Самые длинные строки: \"" + lineOne + "\" и " + "\"" + lineTwo+ "\". Количество символов: " + lineOne.length() + ".");
        } else if (lines.longestLine() == 4){
            System.out.println("Самые длинные строки: \"" + lineOne + "\" и " + "\"" + lineThree+ "\". Количество символов: " + lineOne.length() + ".");
        } else if (lines.longestLine() == 5){
            System.out.println("Самые длинные строки: \"" + lineTwo + "\" и " + "\"" + lineThree + "\". Количество символов: " + lineTwo.length() + ".");
        }else if (lines.longestLine() == 6){
            System.out.println("Все строки \"" + lineOne + "\", \"" + lineTwo + "\" и \"" + lineThree + "\" однаковой длины. Количество символов: " + lineOne.length() + ".");
        }
    }

}
