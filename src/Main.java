import Exceptions.EmailException;
import Exceptions.PasswordException;
import Models.Empleado;
import Models.ListaEmpleados;
import Models.User;
import Models.UserList;
import Services.UserService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Systema de sueldos de Empleados");
        UserService userList = new UserService();
        try {
            User user = new User(1, "Pedro", "email@gmail.com", "1");
            User user2 = new User(2, "Marco", "emailgmail.com", "12345678"); // Email inválido

            userList.addUser(user);
            userList.addUser(user2);

            userList.showAllUsers();
        } catch (EmailException | PasswordException e) {
            System.out.println("Error al crear usuario: " + e.getMessage());
        }

    }
}