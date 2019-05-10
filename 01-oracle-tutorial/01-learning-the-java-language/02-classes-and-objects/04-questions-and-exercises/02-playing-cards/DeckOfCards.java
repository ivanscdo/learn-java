public class DeckOfCards{
    public String[] suit = {"Hearts", "Spades", "Clubs", "Diamonds"};
    public String[] rank = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10",  "Jack", "Queen", "King"};
    public SinglePlayingCard playingCard; 
    // public String[] deck = {};


    public DeckOfCards() {
        for (String suitCard: suit) {
            for(String rankCard: rank) {
                playingCard = new SinglePlayingCard(rankCard, suitCard);
                System.out.println(playingCard.rank + " of " + playingCard.suit);
                // deck.java.util.ArrayList.add(playingCard);
                // System.out.println(deck);
            }
        }
    }
}