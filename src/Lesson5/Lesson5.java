package Lesson5;
/*1. На город напали зомби и у них есть особенность – они едят мозги
только тех горожан, чей год рождения – нечётный. Дан массив с
годами рождения: {1976, 1989, 1965, 1990, 1988, 1995, 1993}. Нужно
заменить в нём все нечетные значения на нули.
2. Группа из двух игроков нашла сундук с сокровищами. Один из них
подошел к нему, но достать можно только две награды. И он решил
смухлевать и достать себе самую большую, а напарнику - самую
маленькую. Вот список наград в сундуке: {12, 200, 14, 76, 197, 3, 201}.
Придумайте способ, как найти минимальный и максимальный
элемент и выведите их в консоль.
3. Размер карты игрового поля 5х5. Нужно создать её и заполнить
значениями от 1 до 25 с помощью вложенных циклов.
4. Представим, что персонаж попал в фонтан опыта и он прибавляет по
единице опыта постоянно, пока значение опыта не достигнет 300.
При этом, даже если значение опыта персонажа больше 300, он
должен получить хотя бы одну единицу из фонтана.*/

import java.util.Arrays;

public class Lesson5 {
    public static void main(String[] args) {
        int[] arr = {1976, 1989, 1965, 1990, 1988, 1995, 1993};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 !=0) System.out.print("");
            else arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();

        int[] arr2 = {12, 200, 14, 76, 197, 3, 201};
        int max = arr2[0];
        int min = arr2[0];
        for (int j : arr2) {
            if (j > max) max = j;
            if (j < min) min = j;
        }
        System.out.println("Максимально число в массиве " + max);
        System.out.println("Минимальное число в массиве " + min);
        System.out.println();

        int[][] arr3 = new int[5][5];
        int x = 1;
        for (int[] ints : arr3) {
            System.out.print(x + " ");
            for (int j = 0; j < ints.length - 1; j++) {
                x++;
                System.out.print(x + " ");
            }
            x++;
            System.out.println();
        }

        System.out.println();

        int expChar = 298;
        do {
            ++expChar;
            System.out.println(expChar);
        } while (expChar <= 300);

    }
}
