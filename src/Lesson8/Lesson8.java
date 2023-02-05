package Lesson8;

/*
В этой задаче тебе нужно выполнить проверку URL-адреса.

Простая схема URL-адреса выглядит так:
<сетевой протокол>://<название ресурса>.<домен>

Метод checkProtocol(String) проверяет, какой сетевой протокол (http или https) у URL-адреса, полученного входящим параметром,
и возвращает результат проверки — строку название сетевого протокола.
А метод checkDomain(String) проверяет, какой домен (com, net, org или ru)
у URL-адреса, полученного входящим параметром, и возвращает результат проверки — строку название домена.

Если URL-адрес начинается не с http или https, то результат будет — "неизвестный".
Если URL-адрес заканчивается не на com, net, org или ru, то результат будет — "неизвестный".

main не принимает участие в тестировании.

Требования:
•	Нужно, чтобы метод checkProtocol(String) был реализован согласно условию.
•	Нужно, чтобы метод checkDomain(String) был реализован согласно условию.
*/

public class Lesson8 {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.ru", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("У URL-адреса - " + url + ", сетевой протокол - " + protocol + ", домен - " + domain);
        }
    }

    public static String checkProtocol(String url) {
        String result;
        if(url.startsWith("https:")) result = "https";
        else if (url.startsWith("http:")) result = "http";//напишите тут ваш код
        else result = "неизвестный";
        return result;
    }

    public static String checkDomain(String url) {
        String result;
        if(url.endsWith(".com")) result = "com";
        else if (url.endsWith(".net")) result = "net";//напишите тут ваш код
        else if (url.endsWith(".org")) result = "org";//напишите тут ваш код
        else if (url.endsWith(".ru")) result = "ru";//напишите тут ваш код
        else result = "неизвестный";
        return result;
    }
}
