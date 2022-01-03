package Home_Tasl_11_Collection;

public class Student {
    private String name;
    private String group;
    private int course;
    private int[] grade;

    public Student(String name, String group, int course, int[] grade) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int[] getGrade() {
        return grade;
    }

    public void setGrade(int[] grade) {
        this.grade = grade;
    }

    public double getAverageGrade(int[] grade) {
        int sum = 0;
        for (int i : grade) {
            sum += i;
        }
        return (double) sum / grade.length;
    }
}
