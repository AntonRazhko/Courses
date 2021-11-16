package Home_Task_9_OOP;

public class Engineers extends Employees implements Salary {
    private int countHoursInMonth;
    private int priceOfHour;

    public Engineers(String profession,String name,int countHoursInMonth, int priceOfHours) {
        super(name,profession);
        this.countHoursInMonth = countHoursInMonth;
        this.priceOfHour = priceOfHours;
    }
    public void leadWorkers(){
        System.out.println("Инженер руководит бригадой рабочих");
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
