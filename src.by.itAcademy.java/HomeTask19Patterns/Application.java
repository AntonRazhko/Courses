package HomeTask19Patterns;

public class Application {
    public static void main(String[] args) {
        DrinkMaker tea = new Tea();
        DrinkMaker latte = new Latte();
        tea.preparationDrink();
        System.out.println();
        latte.preparationDrink();

    }
}
