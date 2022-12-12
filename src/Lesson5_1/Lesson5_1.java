package Lesson5_1;
//Полидром
public class Lesson5_1 {
    public static void main(String[] args) {
        String toCheck = "А роза упала на лапу Азора";
        String toCheck2 = "Madam I'm Adam";
        System.out.println(isStringPalindrome(toCheck));
        System.out.println(isStringPalindrome(toCheck2));
    }

    public static String removeJunk (String check){
        int i, len = check.length();
        char c;
        StringBuilder stringBuilder = new StringBuilder();
        for (i = len - 1; i >=  0 ; i--) {
            c = check.charAt(i);
            if (Character.isLetterOrDigit(c)){
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString().toLowerCase();
    }

    public static boolean isStringPalindrome(String stringToCheck){
        String clean = removeJunk(stringToCheck);
        for (int i = 0; i < clean.length() / 2; i++) {
            if(clean.charAt(i) != clean.charAt(clean.length() - i - 1)) return false;
        }
        return true;
    }
}
