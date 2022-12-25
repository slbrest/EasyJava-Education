package Lesson7;

public class Player {
    public String name;
    public int level;
    public String playerClaas;

    public Player(String name, int level, String playerClaas) {
        this.name = name;
        this.level = level;
        this.playerClaas = playerClaas;
    }

    public void info() {
        System.out.println("Player info: " + this.name + " " + this.level + this.playerClaas);
    }
}
