package HomeTask19Patterns;

public abstract class DrinkMaker {
    public void preparationDrink() {
        System.out.println("Выбираем сканчик");
        System.out.println("Кипятим воду");
        addIngredient();
        System.out.println("Заливаем кипятком");
        addMilk();
        System.out.println("Добавляем сахар ,по желанию");

    }

    public abstract void addIngredient();

    public abstract void addMilk();
}
