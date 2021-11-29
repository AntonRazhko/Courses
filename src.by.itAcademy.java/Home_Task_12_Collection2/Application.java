package Home_Task_12_Collection2;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        public static void main (String[]args){
            //Задание1
            Map<String, Pet> pets = new HashMap<>();
            pets.put("Кот", new Cat("Микуша"));
            pets.put("Сабака", new Dog("Шарик"));
            pets.put("Попугай", new Parrot("Кеша"));
            printKey(pets);

            //Задание2
            Map<String, String> people = new HashMap<>();
            people.put("Ivan", "Nesterenko ");
            people.put("Sergei", "Chaplin");
            people.put("Dmitriy", "Petrov");
            people.put("Alexandr", "Ivanov");
            people.put("Oleg", "Lebedev");
            System.out.println(getMatches(people));
            //Задание 3
            Set<Integer> list1 = new HashSet<>();
            list1.add(3);
            list1.add(7);
            list1.add(-1);
            list1.add(2);
            list1.add(15);
            Set<Integer> list2 = new HashSet<>();
            list2.add(-5);
            list2.add(15);
            list2.add(2);
            list2.add(-1);
            list2.add(7);
            list2.add(36);
            System.out.println(countCommon(list1, list2));

            //Задание4
            Set<String> list = new HashSet<>();
            list.add("foo");
            list.add("buzz");
            list.add("bar");
            list.add("bort");
            list.add("spoon");
            list.add("!");
            System.out.println(removeEvenLength(list));
        }
        public static void printKey (Map < String, Pet > pets){        //метод к заданию 1
            for (Map.Entry<String, Pet> entry : pets.entrySet()) {
                System.out.println(entry.getKey());
            }
        }
        public static boolean getMatches (Map < String, String > people){ // метод к заданию2
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
        public static int countCommon (Set < Integer > list1, Set < Integer > list2){
            Set<Integer> intersection = new HashSet<>(list1);
            intersection.retainAll(list2);
            return intersection.size();
        }
        public static Set<String> removeEvenLength (Set < String > list) {
            Set<String> list2 = new HashSet<>();
            for (Iterator<String> iterator = list.iterator();
                 iterator.hasNext();
            ) {
                String s = iterator.next();
                if (s.length() % 2 != 0) {
                    list2.add(s);
                }
            }
            return list2;
        }

    }
}

