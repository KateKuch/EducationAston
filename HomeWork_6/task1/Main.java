package task1;

public class Main {

    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {

        System.out.println(checkLoginAndPassword("validLogin", "password1", "password1"));
        System.out.println(checkLoginAndPassword("invalid login", "password1", "password1"));
        System.out.println(checkLoginAndPassword("validLogin", "password1", "password2"));
    }


    public static boolean checkLoginAndPassword (String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        //Проверка логина
        if(login.length() >= 20 || login.contains(" ")){
            throw new WrongLoginException("Логин должен быть меньше 20 символов и не должен содержать пробелы.");
        }

        //Проверка пароля
        if(password.length() >= 20 || password.contains(" ") || !password.matches(".*\\d.*")){
            throw new WrongPasswordException("Пароль должен быть меньше 20 символов, не должен содержать пробелов и должен содержать хотя бы одну цифру.");
        }

        //Проверка пароля и его подтверждения
        if(!password.equals(confirmPassword)){
            throw new WrongPasswordException("Пароли не совпадают.");
        }
        return true;
    }

}