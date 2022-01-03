package HomeTask2;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println(getRandomNumber(-20, 20)); //получение случайного числа в диапозоне от -20 до 20
        getFraction();
        getInteger();
        getName();


        System.out.println("Введите число для нахождения квадрата числа"); //нахождение квадрата числа
        Scanner square = new Scanner(System.in);
        int num = square.nextInt();
        System.out.println("Квадрат числа " + num + " равен " + (getSquareNumbers(num)));

        System.out.println("Введите два числа для нахождения среднего арифметического значения");
        Scanner arithmetic = new Scanner(System.in);
        int num1 = arithmetic.nextInt();
        int num2 = arithmetic.nextInt();
        double x = arithmetic(num1, num2);
        System.out.println("Среднее арифметическое чисел " + num1 + " и " + num2 + " равно " + x);

        System.out.println("Введите три числа ");
        Scanner average = new Scanner(System.in);
        double number1 = average.nextDouble();
        double number2 = average.nextDouble();
        float number3 = average.nextFloat();
        double number4 = arithmetic(number1, number2, number3);
        System.out.println("Среднее арифметическое трех чисел равно " + number4);

    }

    public static int getSquareNumbers(int number) {   //метод для нахождения квадрата числа
        return number * number;
    }

    public static double arithmetic(int number1, int number2) {   //среднее арифметическое двух  целых чисел
        return (number1 + number2) / 2;
    }

    public static double arithmetic(double number1, double number2, float number3) {//среднее арифметическое трех дробных чисел
        return (number1 + number2 + number3) / 3;
    }

    public static int getInteger() {
        Scanner s = new Scanner(System.in);         // сканер для целого числа
        System.out.println("Введите целое число");
        return s.nextInt();
    }

    public static double getFraction() {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите дробное число");
        return s.nextDouble();
    }

    public static String getName() {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите имя пользователя");
        return s.nextLine();
    }

    public static double getRandomNumber(int a, int b) {
        return a + (int) (Math.random() * b);
    }
}


