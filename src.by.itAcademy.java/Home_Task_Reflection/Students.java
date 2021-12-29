package Home_Task_Reflection;

public class Students {
    private String name;
    private Integer age;

    public Students(String name, Integer age, String profession) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @AcademyInfo(year = 2020)
    public void sayHello() {
        System.out.println("Меня зовут " + name + " и мне " + age + " лет");
    }

    public void tellProfession() {
        System.out.println("I am an engineer");
    }
}