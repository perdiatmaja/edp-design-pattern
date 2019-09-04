package principles;

public class CantSendMessage implements MessageBehaviour {

    @Override
    public void sendMessage() {
        System.out.println("Can't Send Message");
    }
}