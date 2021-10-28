package Home_Task_5_Arrays;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        //Задание 1
        String[] dayOfWeek = new String[7];
        dayOfWeek[0] = "Monday";
        dayOfWeek[1] = "Tuesday";
        dayOfWeek[2] = "Wednesday";
        dayOfWeek[3] = "Thursday";
        dayOfWeek[4] = "Friday";
        dayOfWeek[5] = "Saturday";
        dayOfWeek[6] = "Sunday";
        System.out.println(dayOfWeek[6]);

        // Задание 2
        int[] array = getArray();
        printArray(array);
        valueAverage(array); // Метод для получения значений

        // Задание 3
        int[] array3 = getArray();
        printArray(array3);
        addValue(array3);

        //Задание4 (метод находится ниже)
    }

    public static int[] getArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int length = scanner.nextInt();
        int[] array = new int[length];
        System.out.println("Заполните массив");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    } //Задание 2 и 3 (создание массива)

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    } // задание 2 и 3 (вывод массива в консоль)

    public static void valueAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = (double) sum / array.length;
        System.out.println("Значения меньше среднеарифмитического");
        for (int j = 0; j < array.length; j++) {
            if (array[j] < average) {
                System.out.println(array[j] + " ");
            }
        }
    } // задание 2( вывод значений ,меньше среднеарифметического)

    public static void addValue(int[] array) {
        System.out.println("Введите индекс");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();// переменная для масива
        int value = scanner.nextInt();
        for (int j = array.length - 1; j > index; j--) {
            array[j] = array[j - 1];
        }
        array[index] = value;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    } //Задание 3 (запись доп. значения в массив)

    public static int getMaxValue(int[][] numbers) {
        int max = numbers[0][0];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (max < numbers[i][j]) {
                    max = numbers[i][j];
                }
            }
        }
        return max;
    } //Задание 4 (нахождение мах значения двухмерного массива)
}