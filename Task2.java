
// Задание №2. Задан целочисленный список ArrayList.
//  Найти минимальное, максимальное и среднее арифметическое из этого списка.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 9; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        int min = minimum(list);
        int max = maximum(list);
        double avg = average(list);

        System.out.println("минимальное число: " + min);
        System.out.println("максимальное число: " + max);
        System.out.printf("среднее арифметическое: " + "%.1f", avg);
    }

    static int minimum(ArrayList<Integer> list) {
        int min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (min > list.get(i))
                min = list.get(i);
        }
        return min;

    }

    static int maximum(ArrayList<Integer> list) {
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i))
                max = list.get(i);
        }
        return max;

    }

    static double average(ArrayList<Integer> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum / list.size();
    }

}