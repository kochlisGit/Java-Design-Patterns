package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class Chatroom
{
    List<User> userList;

    public Chatroom() {
        userList = new ArrayList<>();
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public void showMessage(User user, String message) {
        System.out.println("Message: " + message + ", from " + user);
    }
}
