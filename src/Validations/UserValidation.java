package Validations;

import Exceptions.EmailException;
import Exceptions.PasswordException;

import java.util.regex.Pattern;

public class UserValidation {
    public static void EmailValidator(String email) throws EmailException {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        Pattern p = Pattern.compile(emailRegex);
        if (!p.matcher(email).matches()) {
            throw new EmailException("El email no es válido");
        }
    }
    public static void PasswordValidator(String password)throws PasswordException{
        if (password.length() < 8) {
            throw new PasswordException("La contraseña debe tener al menos 8 caracteres.");
        }
        if (!password.matches(".*[A-Z].*")) {
            throw new PasswordException("La contraseña debe tener al menos una letra mayúscula.");
        }
        if (!password.matches(".*[0-9].*")) {
            throw new PasswordException("La contraseña debe contener al menos un número.");
        }
    }
}
