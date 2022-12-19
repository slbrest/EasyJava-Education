package Lesson6;

import java.util.Arrays;

public class Lesson6 {
    public static void main(String[] args) {
        int[] array = {8, 215, 12, 17, 13, 200};
        sortBarrels(array);
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
}
