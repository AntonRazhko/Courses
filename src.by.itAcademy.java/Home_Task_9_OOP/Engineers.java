package Home_Task_9_OOP;

public class Engineers extends Employees implements Salary {
    private int countHoursInMonth;
    private int priceOfHour;

    public Engineers(int countHoursInMonth, int priceOfHours) {
        this.countHoursInMonth = countHoursInMonth;
        this.priceOfHour = priceOfHours;
    }

    public Engineers() {
    }

    @Override
    public void work() {
        System.out.println("Иженер создает чертеж изделия");

    }

    @Override
    public int getSalary() {
        return countHoursInMonth * priceOfHour;
    }

    public int getPriceOfHours() {
        return priceOfHour;
    }

    public int getCountHoursInMonth() {
        return countHoursInMonth;
    }

    public void setCountHoursInMonth(int countHoursInMonth) {
        this.countHoursInMonth = countHoursInMonth;
    }

    public void setPriceOfHours(int priceOfHours) {
        this.priceOfHour = priceOfHours;
    }
}
