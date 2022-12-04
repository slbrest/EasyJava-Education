package Lesson4;

public class Lesson4 {
    public static boolean isMage;
    public static boolean isWarrior;
    public static int claasNum;
    public static int charLevel;
    public static int playerCoins;
    public static void main(String[] args) {
        isMage = false;
        isWarrior = true;
        claasNum = 1;
        charLevel = 6;
        playerCoins = 1008;
        if(claasNum == 1) showMageSkills();
        else showWarriorSkills();

        if(claasNum == 1 && charLevel > 5) giveNewMageSkills();
        else giveNewWarriorSkills();

        if (claasNum == 1 && (charLevel > 5 || playerCoins > 1000)) giveNewMageSkills();
        else giveNewWarriorSkills();

        if(!isWarrior) showMageSkills();
        else showWarriorSkills();
    }
    public static void showMageSkills() {
        System.out.println("Вы выбрали мага!");
    }
    public static void showWarriorSkills() {
        System.out.println("Вы выбрали воина!");
    }
    public static void giveNewMageSkills() {
        System.out.println("Новые магические скиллы");
    }
    public static void giveNewWarriorSkills() {
        System.out.println("Новые военные скиллы");
    }
}
