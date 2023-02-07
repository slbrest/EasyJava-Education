package Lesson8;

/*
Метод equal(String, String) сравнивает строки по ссылке, используя оператор ==.
Нужно сделать так, чтобы метод возвращал true, если содержимое строк одинаковое, и false — если разное, не используя метод equals().

Требования:
•	Нужно, чтобы в методе equal(String, String) строки сравнивались по содержимому, но используя оператор ==.
•	Нужно, чтобы метод equal(String, String) возвращал true, если строки одинаковые.
•	Нужно, чтобы метод equal(String, String) возвращал false, если строки разные.
•	Метод equals() использовать нельзя
*/

public class Lesson8 {
    public static void main(String[] args) {
        System.out.println(format("Амиго", 5000));
    }

    public static String format(String name, int salary) {
        String phrase = String.format("Меня зовут %s. Я буду зарабатывать $%d в месяц.", name, salary);
        //напишите тут ваш код
        return phrase;
    }
}

