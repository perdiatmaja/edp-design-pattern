package principles;

public class CanSendMessage implements MessageBehaviour {

    @Override
    public void sendMessage() {
        System.out.println("Can Send Message");
    }
}