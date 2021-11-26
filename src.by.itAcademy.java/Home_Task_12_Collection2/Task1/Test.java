package Home_Task_12_Collection2.Task1;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String,Pet> pets= new HashMap<>();
        pets.put("Кот",new Cat("Микуша"));
        pets.put("Сабака", new Dog("Шарик"));
        pets.put("Попугай", new Parrot("Кеша"));
        printKey(pets);
    }public  static void printKey(Map<String,Pet> pets){
        for (Map.Entry<String,Pet> entry:pets.entrySet())
        {System.out.println(entry.getKey());}
    }
}

