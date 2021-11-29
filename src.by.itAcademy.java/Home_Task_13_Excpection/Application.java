package Home_Task_13_Excpection;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        String defaultLogin = "Customer";
        String defaultPassword = "November2021";

        Scanner UserData = new Scanner(System.in);
        System.out.println("Введите логин и пароль");
        String login = UserData.nextLine();
        String password = UserData.nextLine();
        try {
            AuthenticationException.checkAuthentication(login, defaultLogin, password, defaultPassword);
            WrongPasswordException.checkPassword(password);
            WrongLoginAException.checkLogin(login);
        } catch (AuthenticationException e) {
            System.out.println("Пользователя с такими данными не существует");
        } catch (WrongPasswordException e) {
            System.out.println("Пароль не соответствует");
        } catch (WrongLoginAException e) {
            System.out.println("Поле логин незаполнено");
            ;
        }
    }
}