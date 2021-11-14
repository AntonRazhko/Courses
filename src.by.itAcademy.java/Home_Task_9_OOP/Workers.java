package Home_Task_9_OOP;

public class Workers extends Employees implements Salary {
    private int countProducts;
    private int priceOfProduct;

    public Workers(String profession,String name,int countProduct, int priceOfProduct) {
        super(profession,name);
        this.countProducts = countProduct;
        this.priceOfProduct = priceOfProduct;
    }

    @Override
    public void work() {
        System.out.println("Рабочий изготавливает деталь");
    }

    @Override
    public int getSalary() {
        return countProducts * priceOfProduct;
    }

    public int getCountProduct() {
        return countProducts;
    }

    public void setCountProduct(int countProduct) {
        this.countProducts = countProduct;
    }

    public int getPriceOfProduct() {
        return priceOfProduct;
    }

    public void setPriceOfProduct(int priceOfProduct) {
        this.priceOfProduct = priceOfProduct;
    }
}
