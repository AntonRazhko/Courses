package Home_Task_9_OOP;

public class Managers extends Employees implements Salary {
    private int countHoursInMonth;
    private int priceOfHour;
    private int sizePremium;

    public Managers(int countHoursInMonth, int priceOfHours, int sizePremium) {
        this.countHoursInMonth = countHoursInMonth;
        this.priceOfHour = priceOfHours;
        this.sizePremium = sizePremium;
    }

    public Managers() {
    }

    @Override
    public void work() {
        System.out.println("Повышение рентабельности предприятия");
    }

    @Override
    public int getSalary() {
        return countHoursInMonth * priceOfHour + sizePremium;
    }

    public int getCountHoursInMonth() {
        return countHoursInMonth;
    }

    public void setCountHoursInMonth(int countHoursInMonth) {
        this.countHoursInMonth = countHoursInMonth;
    }

    public int getPriceOfHours() {
        return priceOfHour;
    }

    public void setPriceOfHours(int priceOfHours) {
        this.priceOfHour = priceOfHours;
    }

    public int getSizePremium() {
        return sizePremium;
    }

    public void setSizePremium(int sizePremium) {
        this.sizePremium = sizePremium;
    }
}

