package homework6.task1;

public class Main {

    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {

        System.out.println(autentification("admin", "qwertyu1", "qwertyu1"));

        // System.out.println(autentification("adm in", "qwertyu2", "qwertyu2"));
        // System.out.println(autentification("adm in", "qwertyu", "qwertyu"));
        // System.out.println(autentification("adm in", "qwert4yu", "qwertyu"));

    }

    static boolean autentification(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        try {

            if (login.length() > 20 || login.contains(" ") || login.isEmpty()) {
                throw new WrongLoginException("Логин должен быть меньше 20 символов и не должен содержать пробелы!");
            }

            if (password.length() > 20
                    || password.contains(" ")
                    || !isNumeric(password)
                    || !password.equals(confirmPassword)
                    || password.isEmpty()) {

                throw new WrongPasswordException("Пароль должен быть меньше 20 символов,\n " +
                        "не должен содержать пробелов,\n " +
                        "должен иметь хотя бы 1 цифру,\n " +
                        "а также пароли должны совпадать");

            }
        } catch (WrongLoginException | WrongPasswordException e) {

            System.out.printf(e.getMessage());

            return false;
        }

        return true;
    }

    public static boolean isNumeric(String str) {

        for (char c : str.toCharArray()) {

            if (Character.isDigit(c)) {

                return true;
            }
        }
        return false;
    }

}


