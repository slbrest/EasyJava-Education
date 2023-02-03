package Lesson8;

import java.util.Scanner;

public class Lesson8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();

        System.out.println(fahr(c));
    }
    static double fahr (double cels){
        double fahr = 1.8 * cels + 32;
        return fahr;
    }
}
