// Задание № 1.  Пусть дан произвольный список целых чисел, 
// удалить из него четные числа (в языке уже есть что-то готовое для этого)

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int n;
            do {
                System.out.print("Введите длинну массива: ");
                n = sc.nextInt();
            } while (n < 2);
            int[] array = createRandomArray(n, 1, 20);

            System.out.println("Дан массив: " + Arrays.toString(array));

            int[] res = remove(array);
            System.out.println("Результат: " + Arrays.toString(res));
        }

    }

    public static int[] createRandomArray(int length, int min, int max) {
        int[] result = length > 0 ? new int[length] : new int[0];
        if (length > 0) {
            Random rand = new Random();
            for (int index = 0; index < length; index++) {
                result[index] = rand.nextInt(Math.abs(max - min) + 1) + min;
            }
        }
        return result;
    }

    public static int[] remove(int[] ints) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i : ints) {
            if (!(i % 2 == 0)) {
                list.add(i);
            }
        }

        int[] intRes = new int[list.size()];
        int i = 0;
        for (int item : list) {
            intRes[i] = item;
            i++;
        }
        return intRes;

    }

}
