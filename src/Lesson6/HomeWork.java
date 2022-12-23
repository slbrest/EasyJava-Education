package Lesson6;
/*1. Герой снова решает задачи! На этот раз, дверь откроется, только если
герой скажет фразу-палиндром. Палиндром - это такая фраза,
которая читается в обе стороны одинаково. Например: А роза упала
на лапу Азора. Нужно написать метод, который проверит
переданную ему строку и скажет, является ли она палиндромом. В
качестве вспомогательных методов можно использовать -
string.toLowerCase() - чтобы не ошибаться в регистре букв при проверке
и string.replace(“ “, “”) - чтобы удалить пробелы из строки.
2. Попадаем в очередную комнату-головоломку! На полу нарисована
шахматная доска - а не ней фигуры. Но все немного необычно - доска
размером 4х4, а из фигур только ладьи. Нужно расставить ладьи
таким образом, чтобы они не угрожали друг другу! Напоминаю, что
ладья ходит по прямой линии в любом направлении до конца доски.
Всего у этой задачи 24 решения, напишите такой алгоритм, который
найдет их все!
3. Следующая задача так же не менее сложная головоломка! Приходим
комнату с нажимаемыми плитами. Комната - квадратная. Нам
необходимо выделить две диагонали и их не трогать, а вот
получившиеся 4 треугольника раскрасить в разные цвета! Нужно
написать метод, который выведет в консоль матрицу вот примерно
так:
0 2 2 2 0
1 0 2 0 4
1 1 0 4 4
1 0 3 0 4
0 3 3 3 0
*/

public class HomeWork {
    public static void main(String[] args) {
        String toCheck = "А роза упала на лапу Азора";
        String toCheck2 = "Madam I'm Adam";

        System.out.println(isPalindrome(toCheck));
        System.out.println(isPalindrome(toCheck2));

        placeRocks();
    }

    public static boolean isPalindrome(String text) {
        text = text.replaceAll("\\W","");//удаляем все ненужное
        StringBuilder strBuilder = new StringBuilder(text);
        strBuilder.reverse(); //переворачиваем строку
        String invertedText = strBuilder.toString();//присваиваем перевернутую строку

        return text.equalsIgnoreCase(invertedText) ;//возвращаем сравнение двух строк вне зависимости от регистра

    }

    private static void placeRocks()
    {
        int n = 4;
        int count = 0;
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            int[] line0 = new int[n];
            line0[i] = 1;
            array[0] = line0;
            for (int j = 0; j <n ; j++) {
                if(j!=i){
                    int[] line1 = new int[n];
                    line1[j] =2;
                    array[1]= line1;
                    for (int k = 0; k < n; k++) {
                        if(k!=i && k!=j){
                            count++;
                            int[] line2 = new int[n];
                            line2[k]=3;
                            array[2]=line2;
                            for (int l = 0; l <n ; l++) {
                                if(l!=i && l!=j && l!=k) {
                                    int[] line3 = new int[n];
                                    line3[l]=4;
                                    array[3]=line3;
                                }
                            }
                            for (int m = 0; m <n ; m++) {
                                for (int o = 0; o < n; o++) {
                                    System.out.print(array[m][o] + " ");
                                }
                                System.out.println();
                            }
                            System.out.println();
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }

}
