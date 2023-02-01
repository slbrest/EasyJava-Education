package Lesson8;

import java.util.Scanner;

public class Lesson8 {
    public static void main(String[] args) {
        int[] passwords = {2021, 1023, 9929};
        Scanner scanner = new Scanner(System.in);
        int  password = scanner.nextInt();
        for (int x = 0; true;) {
            if (passwords[x] == password)
            System.out.println("Welcome");
        }
    }
}
