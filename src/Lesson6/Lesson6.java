package Lesson6;

import java.util.Arrays;

public class Lesson6 {
    public static void main(String[] args) {
        int[] array = {8, 215, 12, 17, 13, 200};
        int[][] matrix = new int [5][5];
        sortBarrels(array);
        fillDias(matrix);
    }

    public static void sortBarrels(int[] array){
        int wineCount = 0;
        for (int i : array){
            if(i%2 == 0) wineCount++;
        }
        int[] wineArray = new int[wineCount];
        for (int i = 0, j = 0; i < array.length; i++) {
            if(array[i]%2 == 0){
                wineArray[j] = array[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(wineArray));
    }

    public static void fillDias(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(i == j) array[i][j] = 1;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
