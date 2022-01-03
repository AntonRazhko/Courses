package ReflexionAPI;

import java.lang.reflect.Method;

public class Application {
    public static void main(String[] args) {
        Class<Students> studentsClass = Students.class;
        Method[] methods = studentsClass.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName() + " " + method.isAnnotationPresent(AcademyInfo.class));
        }
    }
}
