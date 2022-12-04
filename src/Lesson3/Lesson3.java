package Lesson3;

public class Lesson3 {

    public static void main(String[] args) {
        printLevel(showLevel(10000));
    }
    public static int showLevel (int charExp){
       return charExp / 1000;
    }

    public static void printLevel (int level){
        System.out.println("Уровень персонажа " + level);
    }

}
