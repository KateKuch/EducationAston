package task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] lines = new String[3];
        ArrayList<String> words = new ArrayList<>();

        // заполняем строки
        for (int i = 0; i < 3; i++){
            lines[i] = sc.nextLine();
        }

        // заполняем массив словами из строк
        for(int i = 0; i < 3; i++){
            String[] str = fillTheArrayWithWords(lines[i]);
            for(int j = 0; j < str.length; j++){
                words.add(str[j]);
            }
        }

        //
        String result = null;
        for (int i = 0; i < words.size(); i++) {
            if(findWordWithoutRepeatingChar(words.get(i))){
                result = words.get(i);
                break;
            }
        }

        if (result == null) {
            System.out.println("Нет слов из различных символов.");
        } else {
            System.out.println("Слово из различных символов: " + result);
        }
    }

    public static String[] fillTheArrayWithWords(String line){
        return line.split("\\s+");
    }
    public static boolean findWordWithoutRepeatingChar(String word){
        for(int i = 0; i < word.length(); i++){
            for(int j = i + 1; j < word.length(); j++){
                if(word.charAt(i) == word.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
}
