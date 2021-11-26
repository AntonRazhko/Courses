package Home_Task_12_Collection2.Task2;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        Map<String, String> people = new HashMap<>();
        people.put("Ivan", "Nesterenko ");
        people.put("Sergei", "Chaplin");
        people.put("Dmitriy", "Petrov");
        people.put("Alexandr", "Ivanov");
        people.put("Oleg", "Lebedev");
        System.out.println(getMatches(people));
    }

    public static boolean getMatches(Map<String, String> people) {
        for (Map.Entry<String, String> i : people.entrySet()) {
            String surname = i.getValue();
            int num = 0;
            for (Map.Entry<String, String> j : people.entrySet()) {
                String surname1 = j.getValue();
                if (surname == surname1) {
                    num++;
                } else if (num > 1) {
                    return false;
                }
            }
        }
        return true;
    }
}

