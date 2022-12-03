import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scr = new Scanner(System.in);
//        System.out.println("Hi! Write a sentence to display on the screen.");
//        String str = scr.nextLine();
//        System.out.println(str);
        System.out.println("Вы достигли уровня " + levelUp(5));
    }

    public static int levelUp(int lvl) {
        return lvl+1;
    }
}