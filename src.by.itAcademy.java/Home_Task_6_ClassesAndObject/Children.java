package Home_Task_6_ClassesAndObject;

import java.util.Scanner;

public class Children {
    private String surname;
    private String name;
    private int age;

    public Children() {
        surname ="Иванов";
        name = "Иван";
        age = 5;
    }

    public Children(String surnames, String names, int ages) {
        surname = surnames;
        name = names;
        age = ages;
    }

    public void setParameters() {
        System.out.println("Введите данные пользователя");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Фамилия");
        surname=scanner.nextLine();
        System.out.println("Имя");
        name=scanner.nextLine();
        System.out.println("Возраст");
        age=scanner.nextInt();
    }

    public void printChildren() {
        System.out.println(" Фамилия " + surname + "; Имя " + name + "; Возраст " + age + " лет");
    }


}
