package Home_Tasl_11_Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        Student student1 = new Student("Smirnov Alexandr", "Engineers", 4, new int[]{5, 4, 3, 5});
        Student student2 = new Student("Ivanov Sergei", "Engineers", 3, new int[]{5, 5, 4, 4});
        Student student3 = new Student("Petrov Petr", "Engineers", 2, new int[]{5, 4, 5, 5});
        Student student4 = new Student("Sidorovich Alexandr", "Engineers", 1, new int[]{1, 2, 3, 1});


        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        printStudentsCourse(students, 2);
        printPlusCourse(students);
        deleteStudent(students);
    }

    static void printStudentsCourse(List<Student> students, int course) {
        Iterator<Student> iterator = students.listIterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println("Студенты " + course + " курса " + student.getName());
            }
        }
    }

    static void printPlusCourse(List<Student> students) {
        Iterator<Student> iterator = students.listIterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade(student.getGrade()) > 3) {
                student.setCourse(student.getCourse() + 1);
                System.out.println("Студенты переведенные на следующий курс " + student.getName() + " " + student.getCourse());
            }
        }
    }

    static void deleteStudent(List<Student> students) {
        Iterator<Student> iterator = students.listIterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade(student.getGrade()) <= 3) {
                students.remove(student);
            }
        }
    }
}
