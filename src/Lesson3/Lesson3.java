package Lesson3;
/*
* 1. Написать метод, который вычисляет текущий уровень персонажа. Он
должен принимать в качестве параметра количество опыта (int),
делить это значение на 1000 (количество опыта на уровень) и
возвращать полученный результат типа int.
2. Написать метод, который печатает в консоль уровень персонажа.
Метод ничего не возвращает, принимает в качестве параметра int
переменную уровня, выводит в консоль строку вида “Уровень
персонажа - 5!”. Подсказка. Чтобы вывести в консоль строку и прибавить
к ней переменную, можно воспользоваться арифметическим оператором
“+”. Например так: “Строка” + value
3. Вызывать оба метода в программе, при чем во второй метод передать
значение, полученное из первого.
* */

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
