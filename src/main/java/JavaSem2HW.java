public class JavaSem2HW {
    public static void main(String[] args) {
        // 1 Задание
        // Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
        String str1 = "Java its good, oh my Java";
        String str2 = "Java";

        int num = (str1.length() - str1.replace(str2, "").length()) / str2.length();
        if (num > 0) System.out.println("Vhozhdeniya: " + num);
        else System.out.println("Vhozhdenii net.");

        // 2 Задание
        // Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).

        String res1 = "";
        for (int i = 0; i < str1.length(); i++) res1 += str1.charAt(str1.length() - i -1);
        System.out.println(res1);

        String res2 = "";
        for (int i = 0; i < str2.length(); i++) res2 += str2.charAt(str2.length() - i - 1);
        System.out.println(res2);

        int num2 = (res1.length() - res1.replace(res2, "").length()) / res2.length();
        if (num2 > 0) System.out.println("Vhozhdeniya: " + num);
        else System.out.println("Vhozhdenii net.");

        // Рекурсивный переворот строки
        System.out.println("Rekyrsiya: " + reverseMethod(str1));
    }
    // 3 Задание
    // *Напишите программу, чтобы перевернуть строку с помощью рекурсии.
    public static String reverseMethod( String GETSTRING ) {
        String left;
        String right;

        if (GETSTRING.length() <= 1) return GETSTRING;

        left = GETSTRING.substring(0, GETSTRING.length() / 2);
        right = GETSTRING.substring(GETSTRING.length() / 2, GETSTRING.length());

        return reverseMethod(right) + reverseMethod(left);
    }
}