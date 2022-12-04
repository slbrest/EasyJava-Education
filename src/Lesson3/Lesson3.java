package Lesson3;

public class Lesson3 {
    public static int nextLevel = 1000;
    public static int charExp = 100000;
    public static void main(String[] args) {
        System.out.println(showLevel());
    }
    public static int showLevel (){
       return charExp / nextLevel;
    }
}
