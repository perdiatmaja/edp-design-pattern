package principles;

import base.Phone;

public class SmartPhone extends Phone {

    public SmartPhone(){
        setMessageBehaviour(new CanSendMessage());
    }

    @Override
    public void Display() {
        System.out.println("Wireless");
    }

    @Override
    public void call() {
        System.out.println("Call");
    }
}