package HomeTask4;
import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Введите число");
        Scanner number = new Scanner(System.in);
        int num1 = number.nextInt();
        if (num1 < 1) {
            System.out.println("Вы ввели неверное число");
        } else
            System.out.println("Cумма чисел от 1 до " + num1 + " равна " + getSum(num1));

        //Задание 2
        System.out.println("Задание 2, введите число для проверки ,является ли оно простым");
        Scanner number2 = new Scanner(System.in);
        int num2 = number2.nextInt();
        if(getSimple(num2)){
            System.out.println("Число простое");}
        else {
            System.out.println("Число не является простым");
        }
        //Задание 3
        int num3 = 90;
        while (num3 >= 0) {
            System.out.println(num3 + " ");
            num3 = num3 - 5;
        }
        // Задание №4
        System.out.println("Задание 4, введите целое число");
        Scanner number3 = new Scanner(System.in);
        int num4 = number3.nextInt();
        System.out.println(getAnswer(num4));
    }

    public static int getSum(int num1) { //Метод для нахождения суммы чисел
        int sum = 0;
        for (int i = 1; i <= num1; i++) {
            sum = sum + i;
        }
        return sum;
    }
    public static boolean getSimple(int num2) { // Определение
        boolean result = true;
        for (int b = 2; b < num2; b++) {
            if (num2 % b == 0) {
                result = false;
                break;
            }
        }return result;
    }
    public static String getAnswer(int num4) {  //Тернарный метод
        String evenAndOdd = (num4 % 2 == 0) ? "Число четное" : "Число нечетное";
        return evenAndOdd;
    }
}

