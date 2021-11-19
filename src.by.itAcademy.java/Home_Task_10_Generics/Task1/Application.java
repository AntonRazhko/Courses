package Home_Task_10_Generics.Task1;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {


        String[] str = {"Дождь", "Water", null};
        Integer [] arrays1 = {1, 6, 9, 3, 4, 0};
        Utils<Integer> utils1 = new Utils<>();

        Integer[] numbers = utils1.filter(arrays1 , new Filter< Integer >() {
            @Override
            public boolean apply (Integer o){
                if (o != 0 && o > 2) {
                    return true;
                }
                return false;
            }
        });


        Utils<String> utils = new Utils<>();
        String[] newString = utils.filter(str, new Filter() {

            @Override
            public boolean apply(Object o) {
                if (o != null) {
                    return true;
                }
                return false;
            }
        });
        System.out.println(Arrays.toString(newString));
    }
}
