/*
* AP CS MOOC
* Term 2 - Assignment 5: Shuffle
* A class which represents a DeckNichols of cards. For this assignment, you will need to implement the method shuffleDeck, which appears at the bottom of this class.
*/

import java.util.ArrayList;

public class DeckNichols {
    
    private ArrayList<Card> deck;
    public DeckNichols () {
        deck = new ArrayList <Card>();
        deck = deckCards();
        deck = shuffleDeck();
        System.out.println(deck);
    }

   public String toString () {

       String temp = "";
       for (Card c: deck) {
           temp += c.toString() + "\n";
        }
        
        return temp;
    }

   public Card getTopCard () {
       Card c = deck.get(0);
       deck.remove(0);
       return c;
    }

   public static ArrayList <Card> deckCards () {
       ArrayList <String> cardRank = new ArrayList <String> ();
       cardRank.add ("ace");
       cardRank.add ("two");
       cardRank.add ("three");
       cardRank.add ("four");
       cardRank.add ("five");
       cardRank.add ("six");
       cardRank.add ("seven");
       cardRank.add ("eight");
       cardRank.add ("nine");
       cardRank.add ("ten");
       cardRank.add ("jack");
       cardRank.add ("queen");
       cardRank.add ("king");

       ArrayList <String> cardSuit = new ArrayList <String> ();
       cardSuit.add("clubs");
       cardSuit.add("diamonds");
       cardSuit.add("hearts");
       cardSuit.add("spades");

       ArrayList <Card> deck = new ArrayList <Card> ();
       for (String s : cardSuit) {
           int p = 1;
           for (String r: cardRank) {
               Card c = new Card (r, s, p);
               p++;
               deck.add(c);
            }
        }
        return deck;
   }

//SHUFFLE ****************************


public ArrayList <Card> shuffleDeck () {
    ArrayList <Card> t = new ArrayList <Card> ();
    int[] ind = new int[deck.size()];
    for (int i = 0; i< ind.length; i++) {
        ind[i] = i;
    }

       for (int i = 0; i<deck.size(); i++) {
           int randInt = 0;
           boolean isValid = false;
           while(!isValid) {
               randInt = (int)(Math.random()*deck.size());
               for(int n = 0; n<ind.length; n++) {
                   if(ind[n] == randInt)
                   isValid = true;
                }
            }

            t.add(i, deck.get(randInt));
            ind[randInt] = -1;
        }
        return t;
    }

}