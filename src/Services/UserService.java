package Services;

import Models.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private final List<User> userList = new ArrayList<>();
    public void addUser(User user){
        boolean exists = userList.stream()
                .anyMatch(u -> u.getEmail().equalsIgnoreCase(user.getEmail()));
        if (exists) {
            System.out.println("Error: El email ya está registrado.");
        } else {
            userList.add(user);
        }
    }

    public void showAllUsers(){
        for (User user: userList){
            System.out.println(user.getNombre());
        }
    }
}
