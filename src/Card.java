public class Card {
    // Implement your card class here
    private int val = 0;
    private int suit = 0;
    private String name = "";
    private String suitName = "";
    
    public Card(){
        name = "Joker";
    }

    public Card (int v, int s){
    val = v;
    suit = s;
    String numberName = "" + v;
    

 if (val != 0){
        if (s == 1) {
            suitName = "Clubs";
        }
        else if (s == 2) {
            suitName = "Hearts";
        }
        else if (s == 3) {
            suitName = "Spades";
        }
        else if (s == 4) {
            suitName = "Diamonds";
        }
        
     if (1<val){
        if(v > 10){
            if (v==11){
                numberName = "Jack";
            }
            if (v==12){
                numberName = "Queen";
            }
            if (v==13){
                numberName = "King";
            }
        }
        name =  numberName + " of " + suitName;
         }
    else if (v == 1){
        numberName = "Ace";
        name =  numberName + " of " + suitName;
        }
    }
else{
        name = "Joker";
    }
}

    public int getValue(){
        return val;
    }

    public int getSuit(){
        return suit;
    }

    public void setVal(int n){
        val = n;
    }

    public String toString(){
        return name;
    }
}
