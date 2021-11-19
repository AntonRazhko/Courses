package Home_Task_10_Generics.Task1;

public interface Filter<Type> {
    boolean apply(Type o);
}