package base;

import principles.MessageBehaviour;

public abstract class Phone {

    private MessageBehaviour messageBehaviour;

    public void setMessageBehaviour(MessageBehaviour messageBehaviour) {
        this.messageBehaviour = messageBehaviour;
    }

    public abstract void Display();

    public abstract void call();

    public void sendMessage(){
        messageBehaviour.sendMessage();
    }
}