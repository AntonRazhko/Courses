package Home_Task_10_Generics.Task1;

public class FilterIntegers implements Filter<Integer> {
    @Override
    public boolean apply(Integer o) {
        if (o != 0 && o > 2) {
            return true;
        }
        return false;
    }
}