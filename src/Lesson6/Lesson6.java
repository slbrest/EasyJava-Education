package Lesson6;

import java.util.Arrays;

public class Lesson6 {
    public static void main(String[] args) {
        int[] array = {1,90,15,60,21,11};
        bubbleSort(array);
        bubbleSortDesc(array);
    }

    public static void bubbleSort(int[] array){
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if(array[j] > array[j+1]){
                    int t = array[j];
                    array[j] = array[j+1];
                    array[j+1] = t;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSortDesc(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i] < array[j]){
                    int t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

}
