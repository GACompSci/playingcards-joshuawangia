public class App {
    public static void main(String[] args) throws Exception {
        // Use nested loops to create a full deck (plus two Jokers)
        for (int s = 1; s<=4; s++){
            for (int c = 1; c <= 13; c++){
                Card alice = new Card(c,s);
                System.out.println(alice.toString());
            }
        }
        for (int j = 0; j<2; j++){
            Card joker = new Card();
            System.out.println(joker.toString());

        }

        // printing each card as you create it. 
    }
}
