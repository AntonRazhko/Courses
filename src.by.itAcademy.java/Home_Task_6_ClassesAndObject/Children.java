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

   public void setSurname(String surnames){
        surname=surnames;
    }
    public void setName(String names){
        name=names;
    }
    public void setAge(int ages){
        age=ages;
    }

    public void printChildren() {
        System.out.println(" Фамилия " + surname + "; Имя " + name + "; Возраст " + age + " лет");
    }


}
