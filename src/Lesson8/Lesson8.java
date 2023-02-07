package Lesson8;

/*
Используя StringTokenizer раздели query на части по разделителю delimiter.

Пример:
getTokens("java.util.stream", "\\.")
возвращает массив строк
{"java", "util", "stream"}

Hint: решить задачу поможет метод countTokens().

Требования:
•	Нужно, чтобы метод getTokens(String, String) использовал StringTokenizer.
•	Нужно, чтобы метод getTokens(String, String) возвращал массив типа String, заполненный согласно условию задачи.
*/

import java.util.Arrays;
import java.util.StringTokenizer;

public class Lesson8 {
        public static void main(String[] args) {
            String packagePath = "java.util.stream";
            String[] tokens = getTokens(packagePath, "\\.");
            System.out.println(Arrays.toString(tokens));
        }

        public static String[] getTokens(String query, String delimiter) {
           StringTokenizer token = new StringTokenizer(query, delimiter);
           int i = 0;
            String[] tokens = new String[token.countTokens()];
            while (token.hasMoreTokens())
            {
                tokens[i++] = token.nextToken();

            }//напишите тут ваш код
            return tokens;
        }
}

