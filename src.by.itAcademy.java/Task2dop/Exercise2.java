package Task2dop;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner numbers = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1= numbers.nextInt();
        System.out.println("Enter number 2");
        int num2=numbers.nextInt();

        System.out.println(divide(num1,num2));
    }
    public static boolean divide (int num1, int num2){
        return num1 % num2 == 0;
    }
}
