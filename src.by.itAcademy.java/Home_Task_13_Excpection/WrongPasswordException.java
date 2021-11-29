package Home_Task_13_Excpection;

public class WrongPasswordException extends Exception {
    public static boolean checkPassword(String password) throws WrongPasswordException {
        if (password.matches("(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z]).{8,20}")) {
            System.out.println("Пароль соответствует");
        } else {
            throw new WrongPasswordException();
        }
        return false;
    }
}