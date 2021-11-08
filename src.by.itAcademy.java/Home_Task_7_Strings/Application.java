package Home_Task_7_Strings;

public class Application {

    public static void main(String[] args) {
        //Задание 1
        String s = "I Like Java!!!";
        System.out.println(getLastChar(s));
        System.out.println(getEndsString(s));
        System.out.println(getStartsString(s));
        System.out.println(getContain(s));
        System.out.println(getIndex(s));
        System.out.println(getLowString(s));
        System.out.println(getUpperString(s));
        System.out.println(getStr(s));
        // Задание 2
        String s1 = "Java, Python,Ruby,Javascript,and Go";
        System.out.println(amountComma(s1));
        //Задание 3
        String text = "Имеется строка с текстом, вывести текст, составленный из последних букв всех слов";
        System.out.println(getLastLetters(text));

    }


    public static char getLastChar(String s) {
        return s.charAt(s.length() - 1);
    }

    public static boolean getEndsString(String s) {
        return s.endsWith("!!!");
    }

    public static boolean getStartsString(String s) {
        return s.startsWith("I like");
    }

    public static boolean getContain(String s) {
        return s.contains("Java");
    }

    public static int getIndex(String s) {
        return s.indexOf("Java");
    }

    public static String getLowString(String s) {
        return s.toLowerCase();
    }

    public static String getUpperString(String s) {
        return s.toUpperCase();
    }

    public static String getStr(String s) {
        return s.substring(7, 11);
    }

    public static int amountComma(String string) {
        int amount = 0;
        char[] array = string.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == ',') {
                amount += 1;
            }
        }
        return amount;
    }

    public static StringBuilder getLastLetters(String text) {
        text = text.replaceAll(",", "");
        String[] arrayWords = text.split(" ");
        StringBuilder resultString = new StringBuilder();
        for (String word : arrayWords) {
            resultString.append(word.charAt(word.length() - 1));
        }
        return resultString;
    }
}


