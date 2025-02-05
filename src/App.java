import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Deck myDeck = new Deck();
        Hand newHand = new Hand(5, myDeck);
        System.out.println(newHand.printHand());
        newHand.sortHand();
        System.out.println( newHand.printHand());

    }
}
