package Lesson4;
/*
1. Написать метод, которому на вход подается целочисленное
значение, означающее класс персонажа. Метод должен вывести в
консоль фразу «Выбран класс » + название класса. Всего вариаций
классов может быть 10: воин, маг, лучник, убийца, чернокнижник,
шаман, паладин, скаут, лекарь, бард. Если пришло какое-то
некорректное значение, то нужно вывести предупреждение, что
такого класса нет. Необходимо выбрать соответствующую
конструкцию ветвления кода и применить её в методе.
2. Написать метод, который выдает пользователю награду по
достижению каждого пятого уровня. Методу на вход подается
целочисленное значение текущего уровня, и если это значение
соответствует условию «каждый пятый», тогда выдается награда.
3. Написать метод, который должен открыть подземелье для группы из
двух игроков. Условия открытия подземелья:
3.1. Минимальный уровень персонажа 10, если хотя бы один из
участников меньше, то не откроется
3.2. Разница между максимальным и минимальным уровнем в группе
должна быть не больше 3-х.
3.3. Для упрощения условия, уровни персонажей не могут быть равны
между собой
4. Написать метод, который позволит стражу подземелья узнать,
находится ли уровень персонажа в диапазоне, допустимом для
попадания в подземелья. Страж охраняет разные, так что метод
нужен универсальный. Он должен принимать три значения –
минимальный уровень для входа, максимальный уровень, и текущий
уровень персонажа, и проверять, может ли персонаж войти. Значения
минимума и максимума включаются в диапазон.
*/

import java.util.Scanner;

public class Lesson4 {

    public static int playerClaas;
    public static String claas;
    public static int lvlChar = 5;
    public static int onePlayer = 18;
    public static int twoPlayer = 14;

    public static void main(String[] args) {

        System.out.println("Выберете клаас пресонажа: 1 - воин, 2 - маг, 3 - лучник, 4- убийца, 5 - чернокнижник,\n" +
                "6- шаман, 7 - паладин, 8 - скаут, 9 - лекарь, 10 - бард ");

        Scanner scr = new Scanner(System.in);
        playerClaas = scr.nextInt();
        scr.close();

        switch (playerClaas) {
            case 1 -> claas = "воина.";
            case 2 -> claas = "мага.";
            case 3 -> claas = "лучника.";
            case 4 -> claas = "убийцу.";
            case 5 -> claas = "чернокнижника.";
            case 6 -> claas = "шамана.";
            case 7 -> claas = "паладина.";
            case 8 -> claas = "скаута.";
            case 9 -> claas = "лекаря.";
            case 10 -> claas = "барда.";
            default -> claas = "Нет такого персонажа";
        }

        youChose(claas);
        bonus();
        openDangerous();
        correctLvl(45);

    }

    public static void bonus(){
        if(lvlChar % 5 == 0) System.out.println("Вы получили бонус");
    }

    public static void youChose(String claas) {
        System.out.println("Вы выбрали " + claas);
    }

    public static void openDangerous(){
        if((onePlayer >= 10 && twoPlayer >= 10) && ((onePlayer - twoPlayer) <= 3 && (twoPlayer - onePlayer) <= 3)) System.out.println("Open door");
        else System.out.println("Персонажы не соответствуют требованиям.");
    }
    public static void correctLvl(int lvl){
        int maxLvl = 45;
        int minLvl = 40;
        if(lvl >= minLvl && lvl <= maxLvl) System.out.println("Your lvl correct");
        else System.out.println("Don't correct lvl.");
    }

}
