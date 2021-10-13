package HomeTask3;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

    public class Application {

        public static void main(String[] args) {
            System.out.println("Для вызова необходимого метода введите число:\n" +
                    "1 - принадлежит ли случайное число интервалу от 25 до 100\n" +
                    "2 - существует ли треугольник\n" +
                    "3 - название текущего дня недели\n");
            Scanner number = new Scanner(System.in);
            int typedNumber = number.nextInt();
            if (typedNumber == 1) {
                // Задание 1
                int min = 5;
                int max = 150;
                int diff = max - min;
                Random random = new Random();
                int i = random.nextInt(diff + 1) + min;
                System.out.println(i);
                getResult(i);
            } else if (typedNumber == 2) {
                //Задание 2
                Scanner sidesTriangle = new Scanner(System.in);
                System.out.println("Введите длинну для каждого из трех отрезков");
                double side1 = sidesTriangle.nextDouble();
                double side2 = sidesTriangle.nextDouble();
                double side3 = sidesTriangle.nextDouble();
                getTriangle(side1, side2, side3);
            } else if (typedNumber==3) {
                //Задание 3
                Calendar calendar = Calendar.getInstance();
                int numDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
                System.out.println(numDayOfWeek);
                dayOfWeek(numDayOfWeek);
            }
        }


        public static void getResult(int num) {
            if (25 < num && num < 100) {
                System.out.println("Число попадает в заданный интервал");
            } else {
                System.out.println("Число не попадает в заданный интервал");
            }
        }

        public static void getTriangle(double side1, double side2, double side3) {
            if (side1 + side2 >= side3) {
                System.out.println("Треугольник возможен");
            } else if (side1 + side3 >= side2) {
                System.out.println("Треугольник возможен");
            } else if (side2 + side3 >= side1) {
                System.out.println("Треугольник возможен");
            } else {
                System.out.println("Треугольник невозможен");
            }
        }
        public static void dayOfWeek(int day) {
            switch (day) {
                case 1:
                    System.out.println("Sunday");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Wednesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
                case 7:
                    System.out.println("Saturday");
            }

        }
    }


