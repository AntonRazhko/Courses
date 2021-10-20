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
                boolean result = getResult(i);
                if (result) {
                    System.out.println("Чсло входит в заданный промежуток");
                } else System.out.println("Число не входит в заданный промежуток");
            } else if (typedNumber == 2) {
                //Задание 2
                Scanner sidesTriangle = new Scanner(System.in);
                System.out.println("Введите длинну для каждого из трех отрезков");
                double side1 = sidesTriangle.nextDouble();
                double side2 = sidesTriangle.nextDouble();
                double side3 = sidesTriangle.nextDouble();
                System.out.println(getTriangle(side1, side2, side3));
            } else if (typedNumber == 3) {
                //Задание 3
                Calendar calendar = Calendar.getInstance();
                int numDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
                System.out.println(numDayOfWeek);
                dayOfWeek(numDayOfWeek);
                System.out.println(dayOfWeek(numDayOfWeek));
            }
        }
        public static boolean getResult(int num) {
            return (25 < num && num < 100);
        }

        public static boolean getTriangle(double side1, double side2, double side3) {
            boolean getTriangle = true;
            if (side1 + side2 >= side3 || side1 + side3 >= side2 || side2 + side3 >= side1) {getTriangle = true;
            } else getTriangle = false;
            return getTriangle;
        }

        public static String dayOfWeek(int day) {
            String dayOfWeek = null;
            switch (day) {
                case 1:
                    dayOfWeek = "Sunday";
                    break;
                case 2:
                    dayOfWeek = "Monday";
                    break;
                case 3:
                    dayOfWeek = "Tuesday";
                    break;
                case 4:
                    dayOfWeek = "Wednesday";
                    break;
                case 5:
                    dayOfWeek = "Thursday";
                    break;
                case 6:
                    dayOfWeek = "Friday";
                    break;
                case 7:
                    dayOfWeek = "Saturday";
                    break;
            }
            return dayOfWeek;
        }

    }