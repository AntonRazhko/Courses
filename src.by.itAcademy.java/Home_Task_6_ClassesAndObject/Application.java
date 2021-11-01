package Home_Task_6_ClassesAndObject;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        //Задание 1
        int[] array = getArray(10);
        printArray(array);
        System.out.println();
        printNumbers(array);
        // Задание 2
        int[][] array2D = get2DArray();
        print2DArray(array2D);
        printStringAndColumn(array2D);

        //Задание 3
        Children children1 = new Children("Смирнова", "Дарья", 6);
        Children children2 = new Children();
        children2.setParameters();

        children1.printChildren();
        children2.printChildren();
        //Задание 4
        Customers customer1 = new Customers("Ivanov", "Ivan", "Ivanovich", 1988, 1231, 100500);
        Customers customer2 = new Customers("Smirnov", "Ivan", "Ivanovich", 1986, 1299, 100501);
        Customers customer3 = new Customers("Fateev", "Ivan", "Ivanovich", 1977, 1291, 100502);
        Customers[] customers = {customer1, customer2, customer3};
        printUserNameWithCardOn1(customers);


    }

    public static int[] getArray(int size) {
        int[] array = new int[size];
        array[0] = 0;
        for (int i = 1; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        return array;
    } /// Задание 1

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    } // Задание 1

    public static void printNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i < array[i]) {
                System.out.println("Значение под индеком " + i + " больше своего индекса и равно " + array[i]);

            }
        }
    } // Задание 1

    public static int[][] get2DArray() {
        System.out.println("Введите размер матрицы");
        Scanner sizeArray = new Scanner(System.in);
        int string = sizeArray.nextInt();
        int column = sizeArray.nextInt();
        int[][] array = new int[string][column];
        for (int i = 0; i < string; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }

        return array;
    } //Задание 2

    public static void print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println();
        }
    } //Задание 2

    public static void printStringAndColumn(int[][] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку для вывода на экран");
        int string = scanner.nextInt();
        for (int j = 0; j < array[string].length; j++) {
            System.out.print(" " + array[string][j] + " ");
        }
        System.out.println();
        System.out.println("Введите столбец для вывода");
        int column = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i][column]);
        }
    } //Задание 2

    public static void printUserNameWithCardOn1(Customers[] customers) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i].getNumber_card() % 10 == 1) {
                System.out.println(customers[i].getName());
            }
        }

    }//Задание 4


}
