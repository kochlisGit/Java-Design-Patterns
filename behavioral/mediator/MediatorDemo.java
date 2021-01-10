package behavioral.mediator;

// Mediator pattern is used to reduce the communication between multiple classes and objects.
public class MediatorDemo
{
    public static void main(String[] Args)
    {
        Messenger mgr = new Messenger();
        Chatroom room = new Chatroom();
        User u1 = new User("user0090");
        User u2 = new User("user8756");
        User u3 = new User("user1200");
        room.addUser(u1);
        room.addUser(u2);
        room.addUser(u3);

        mgr.sendMessage(room, u1, "Hey everyone, how is it going?");
        mgr.sendMessage(room, u3, "yo, it's almost there...");
        mgr.sendMessage(room, u1, "Where there?");
        mgr.sendMessage(room, u3, "Where is it going?");
        mgr.sendMessage(room, u2, "hihihi");
    }
}
