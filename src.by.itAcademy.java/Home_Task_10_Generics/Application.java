package Home_Task_10_Generics;

public class Application {
    public static void main(String[] args) {
        for (SizeClothes sizes: SizeClothes.values())
        {
            System.out.println(sizes+" "+sizes.getDescription());

        }

    }
}
