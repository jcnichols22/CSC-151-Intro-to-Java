/*
The second class, Main, will use the Card class and your modified Deck class to create a shuffled Deck object and deal the two hands. 
The hands should be dealt in alternating order, starting with the first hand. As the cards are dealt into each hand they should be removed from the deck.

For example, each hand is shown for the following Deck.
seven of spades <---- Index 0, top card
queen of spades <---- Index 1, etc.
ten of spades
eight of spades
three of spades
king of hearts
queen of hearts
jack of clubs
four of clubs
eight of clubs
king of diamonds
seven of hearts
Hand 1: Hand 2:
seven of spades queen of spades
ten of spades eight of spades
three of spades king of hearts
queen of hearts jack of clubs
four of clubs eight of clubs

Also, all of these cards should be removed from the deck

After dealing the hand, Main should use the point value of each card to calculate the total point value of each hand. 
The hand with the highest point value wins. In the case of a draw, the second hand wins. In this game ace = 1, jack = 11, queen = 12, and king = 13. 
In the deck the card in the first position (index 0) is the top of the deck. 

Lastly, Main will declare the winning hand. See the following sample run of Main for the exact format that will be expected by the code-runner.

Sample Run of Main:

Hand 1: total points 22
three of clubs (point value = 3)
two of clubs (point value = 2)
six of hearts (point value = 6)
ten of hearts (point value = 10)
ace of spades (point value = 1)

Hand 2: total points 27
four of spades (point value = 4)
ten of clubs (point value = 10)
three of diamonds (point value = 3)
eight of diamonds (point value = 8)
two of hearts (point value = 2)

Hand 2 wins
*/

import java.util.ArrayList;

public class MainNichols {
    private static ArrayList<Card> hand_1 = new ArrayList<Card>();
    private static ArrayList<Card> hand_2 = new ArrayList<Card>();
    private static DeckNichols dk = new DeckNichols();
    public static void main(String[] args){
        for (int i = 0; i<5; i++){
            hand_1.add(dk.getTopCard());
            hand_2.add(dk.getTopCard());
        }

       int hand_1Value = 0;

       for (int i = 0; i<hand_1.size(); i++){
           Card cC = hand_1.get(i);
           hand_1Value += cC.getPointValue();
        }

       int hand_2Value = 0;

       for (int i = 0; i<hand_2.size(); i++){
           Card cC = hand_2.get(i);
           hand_2Value += cC.getPointValue();
        }

       System.out.println("Hand 1: total points " + hand_1Value);

       for (int i = 0; i<hand_1.size(); i++){
           System.out.println(hand_1.get(i));
        }

       System.out.println("\nHand 2: total points " + hand_2Value);

       for (int i = 0; i<hand_2.size(); i++){
           System.out.println(hand_2.get(i));
        }

      if(hand_1Value<hand_2Value){
          System.out.println("Hand 2 wins");
        }
       else if(hand_2Value<hand_1Value){
           System.out.println("Hand 1 wins");
        }
       else
           System.out.println("Tie");
        }

}