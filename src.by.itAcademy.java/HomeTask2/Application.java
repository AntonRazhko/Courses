package HomeTask2;
import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println(squareNumbers(5)); //число в квадрате
        System.out.println(arithmetic(26,32)); //среднее арифмитическое
        System.out.println(arithmetic(15.22,15.36,13.2854f)); //среднее арифмитическое

        Random random= new Random();
        System.out.println( random.nextInt(111));

        Scanner s = new Scanner (System.in);         // сканер для целого числа
        System.out.println("Введите целое число");
        int integer = s.nextInt();

        System.out.println("Введите дробное число"); //сканер для дробного числа
        Scanner t = new Scanner(System.in);
        double fraction = t.nextDouble();

        System.out.println("Введите свое имя");  //сканер для ввода имени
        Scanner name = new Scanner(System.in);
        String myName= name.nextLine();

    }
    public static int squareNumbers(int number1) {   //метод для нахождения квадрата числа
        return number1*number1;
    }
    public static int arithmetic (int number1,int number2){   //среднее арифмитическое двух  целых чисел
        return (number1+number2)/2;
    }
    public static double arithmetic (double number1, double number2, float number3){ //среднее арифмитическое трех дробных чисел
        return (number1+number2+number3)/3;
    }

}

