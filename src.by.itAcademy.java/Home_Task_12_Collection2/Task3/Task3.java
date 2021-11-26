package Home_Task_12_Collection2.Task3;

import java.util.HashSet;
import java.util.Set;

public class Task3  {
    public static void main(String[] args) {
        Set<Integer> list1= new HashSet<>();
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
        System.out.println(countCommon(list1,list2));
    }

    public static int countCommon(Set<Integer> list1, Set<Integer> list2) {
        Set<Integer> intersection= new HashSet<>(list1);
        intersection.retainAll(list2);
        return intersection.size();
    }
}
