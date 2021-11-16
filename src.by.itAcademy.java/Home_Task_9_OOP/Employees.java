package Home_Task_9_OOP;

public abstract class Employees {
    private String profession;
    private String name;

    public Employees(String profession, String name) {
        this.profession = profession;
        this.name = name;
    }

    public abstract void work();

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
