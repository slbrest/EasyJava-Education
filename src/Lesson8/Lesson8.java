package Lesson8;

import java.util.Scanner;

public class Lesson8 {
    static String isPrime(int number)
    {
        String result = "Is prime";
            if((number / 2) >= 2){
                if (number % number == 0) {
                 result = "Isn't prime";
        }
    }
        return result;//return the result
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number = read.nextInt();
        String output = isPrime(number);
        System.out.println(output);
    }
}
