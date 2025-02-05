import java.util.ArrayList;

public class Hand {
    ArrayList<Card> Hand = new ArrayList<>();

    public Hand(int numCards, Deck myDeck){
        for(int i=0; i < numCards; i++){
            Hand.add(myDeck.drawCard());
        }
    }

    public int cardPresent(int val, int suit){
        Card c = new Card(val, suit); 
        int index = Hand.indexOf(c);
        if (index != -1){
            return index;
        }
        else{
            return -1;
        }
    }

    public Card playCard(int val, int suit){
        if (cardPresent(val, suit) != -1){
            Card playedCard = new Card(val, suit);
            Hand.remove(playedCard);
            return playedCard;
        }
        else{
            return null;
        }
    }

    public void addCard(Card a){
        Hand.add(a);
    }

    public String printHand(){
        String printString = "";
        for (Card p : Hand){
            printString += p + ", ";
        } 
        return printString;
    }

    public void sortHand(){
        ArrayList<Card> sorted = new ArrayList<>();
        for (int i = 0; i < Hand.size()-1; i++){
            Card least = Hand.get(i);
            for (int j = 1; j < Hand.size(); j++){
                if(least.getValue() > Hand.get(j).getValue()){
                    least = Hand.get(j);
                }
            }  
            sorted.add(least);
            Hand.remove(least);
            i--;
        }
        sorted.add(Hand.get(0));
        Hand = sorted;
    }


}
