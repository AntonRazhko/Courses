package Home_Task_10_Generics.Task1;

import java.util.Arrays;

public class Utils<Type> {
    Type [] filter (Type [] array ,Filter filter)
    { int num =0;
        for(int i=0;i<array.length;i++) {
            if (filter.apply(array[i])) {
                array[i-num]=array[i];
            }else num++;
        }return Arrays.copyOf(array,array.length- num);
    }
}