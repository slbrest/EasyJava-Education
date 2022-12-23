package Lesson5_1;
//Полидром
public class Lesson5_1 {
    public static void main(String[] args) {
        String toCheck = "А роза упала на лапу Азора";
        String toCheck2 = "Madam I'm Adam";

        System.out.println(isPalindrome(toCheck));
        System.out.println(isPalindrome(toCheck2));
    }

    public static boolean isPalindrome(String text) {
        text = text.replaceAll("\\W","");//удаляем все ненужное
        StringBuilder strBuilder = new StringBuilder(text);
        strBuilder.reverse(); //переворачиваем строку
        String invertedText = strBuilder.toString();//присваиваем перевернутую строку

        return text.equalsIgnoreCase(invertedText) ;//возвращаем сравнение двух строк вне зависимости от регистра

    }
}
