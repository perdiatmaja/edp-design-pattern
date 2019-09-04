import base.Condition;
import principles.CanSendMessage;
import principles.HomePhone;
import puzzle.HPCondition;
import puzzle.PotionHPBehaviour;

public class Main {

    public static void main(String[] args) {
        System.out.println("DESIGN PATTERNS : ");

        printWithSeparator("Principles");
        HomePhone homePhone = new HomePhone();
        homePhone.Display();
        homePhone.call();
        homePhone.sendMessage();
        homePhone.setMessageBehaviour(new CanSendMessage());
        homePhone.sendMessage();

        printWithSeparator("Puzzle");
        Condition condition = new HPCondition(new PotionHPBehaviour());
        condition.low();
    }

    private static void printWithSeparator(String text) {
        System.out.println("\n======= " + text + " =======");
    }
}
