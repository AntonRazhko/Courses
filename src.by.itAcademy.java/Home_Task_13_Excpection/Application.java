package Home_Task_13_Excpection;

import java.util.Scanner;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws ErrorAuthentication, WrongPasswordException {
        Map<String, String> usersShop = new HashMap<>();
        usersShop.put("User1", "December123");
        usersShop.put("User2", "ABC123");
        usersShop.put("User3", "Hello123");
        usersShop.put("User4", "12345");
        usersShop.put("User5", "Day5");
// Регистрация пользователя, проверка пароля на соответствие условиям регистрации
        Scanner UserData = new Scanner(System.in);
        System.out.println("Введите логин и пароль для регистрации");
        String login = UserData.nextLine();
        String password = UserData.nextLine();
        if (!password.matches("(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z]).{8,20}")) {
            throw new WrongPasswordException("Пароль не соответствует требованиям");
        }
        usersShop.put(login, password);
        //Аутентификация пользователя
        String loginIn = UserData.nextLine();
        String passwordIn = UserData.nextLine();
        if (usersShop.containsKey(loginIn) && usersShop.get(loginIn).equals(passwordIn)) {
            System.out.println("Вы прошли аутенцфикацию");
        } else {
            throw new ErrorAuthentication("Пользователя с такими данными не существует");
        }
    }
}