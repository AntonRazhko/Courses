package Home_Task_12_Collection2.Task4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Task4 {
    public static void main(String[] args) {
        Set<String> list = new HashSet<>();
        list.add("foo");
        list.add("buzz");
        list.add("bar");
        list.add("bort");
        list.add("spoon");
        list.add("!");
        System.out.println(removeEvenLength(list));
    }

    public static Set<String> removeEvenLength(Set<String> list) {
        Set<String> list2= new HashSet<>();
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
