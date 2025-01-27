public class Deck {
    private Card[] Deck = new Card[52];
    
    public Deck(){
        //Create Deck
        int count = 0;
        for (int s = 1; s<=4; s++){
            for (int c = 1; c <= 13; c++){
                Card alice = new Card(c,s);
                Deck[count] = alice;
                count++;
            }
        }
        shuffle();
    }

    private void shuffle(){
        Card temp;
        for(int i = 0; i < Deck.length; i++){
            temp = Deck[i];
            int newVal = (int) (Math.random()*52);
            Deck[i] = Deck[newVal];
            Deck[newVal] = temp;
        }
    }

    public Card drawCard(){
        Card[] newDeck = new Card[Deck.length-1];
        Card drawnCard = Deck[0];
        for(int k = 1; k<Deck.length; k++){
            newDeck[k-1] = Deck[k];
        }
        Deck = newDeck;
        return drawnCard;
    }

    public String toString(){
        String name = "Deck of " + Deck.length + " cards.";
        return name;
    }

}
