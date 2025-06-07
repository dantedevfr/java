package Models;

import Exceptions.EmailException;
import Exceptions.PasswordException;
import Validations.UserValidation;

public class User {
    int id;
    String nombre;
    String email;
    String password;

    public User(int id, String nombre, String email, String password) throws EmailException, PasswordException {
        this.id = id;
        this.nombre = nombre;
        setEmail(email);
        setPassword(password);
    }

    public void setEmail(String email) throws EmailException {
            UserValidation.EmailValidator(email);
            this.email = email;
    }
    public String getEmail(){
        return this.email;
    }

    public void setPassword(String password) throws PasswordException{
        UserValidation.PasswordValidator(password);
        this.password = password;
    }

    public String getNombre(){
        return this.nombre;
    }


}
