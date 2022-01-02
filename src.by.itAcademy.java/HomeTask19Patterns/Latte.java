package HomeTask19Patterns;

public class Latte extends DrinkMaker {
    @Override
    public void addIngredient() {
        System.out.println("Засыпаем чай в стакан");
    }

    @Override
    public void addMilk() {
        System.out.println("Подогреваем молоко и взбиваем");
    }

}
