package task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();

        array.add(5);
        array.add(10);
        array.add(4);
        array.add(3);
        array.add(7);
        array.add(10);
        array.add(11);
        array.add(4);
        array.add(4);
        array.add(8);

        List<Integer> newArray = array.stream()
                .distinct()
                .filter( n -> n % 2 == 0)
                .collect(Collectors.toList());

        int summ = newArray.stream()
                .mapToInt(Integer :: intValue)
                .sum();

        System.out.println("Сумма получившегося количества элементов: " + summ);
    }
}
