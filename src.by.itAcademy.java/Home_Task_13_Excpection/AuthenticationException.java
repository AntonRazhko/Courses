package Home_Task_13_Excpection;

public class AuthenticationException extends Exception {
    public static boolean checkAuthentication(String login, String defaultLogin, String password, String defaultPassword) throws AuthenticationException {
        if (defaultLogin.equals(login) && defaultPassword.equals(password)) {
            System.out.println("Аутентификация пройдена");
        } else {
            throw new AuthenticationException();
        }
        return false;
    }
}