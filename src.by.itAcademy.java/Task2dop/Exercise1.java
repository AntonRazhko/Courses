package Task2dop;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("Введите два числа");
        Scanner numbers = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num1= numbers.nextInt();
        System.out.println("Введите второе число");
        int num2=numbers.nextInt();
        System.out.println("Введите число n");
        int n=numbers.nextInt();
        System.out.println(num1+" больше "+num2+" на "+n);

        System.out.println(compare(num1,num2,n));
    }
    public static boolean compare(int num1,int num2, int n){
        return num1-num2==n;
    }
}
