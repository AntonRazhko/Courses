package Home_Task_13_Excpection;

public class WrongLoginAException extends Exception {
    public static boolean checkLogin(String login) throws WrongLoginAException {
        if (login.isEmpty()) {
            throw new WrongLoginAException();
        }
        return false;
    }
}