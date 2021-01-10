package behavioral.mediator;

public class Messenger
{
    public void sendMessage(Chatroom chatroom, User user, String message) {
        chatroom.showMessage(user, message);
    }
}
