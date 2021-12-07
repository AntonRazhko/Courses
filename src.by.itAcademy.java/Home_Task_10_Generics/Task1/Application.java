package Home_Task_10_Generics.Task1;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

        String[] str = {"Дождь", "Water", null};
        Integer[] arrays1 = {1, 6, 9, 3, 4, 0};
        Utils<String> utils = new Utils<>();
        Utils<Integer> utils1 = new Utils<>();

        String[] newString = utils.filter(str, new FilterSrtrings());
        Integer[] inst = utils1.filter(arrays1, new FilterIntegers());

        System.out.println(Arrays.toString(newString));
        System.out.println(Arrays.toString(inst));
    }
}
