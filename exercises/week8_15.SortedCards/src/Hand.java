/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sam
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Hand implements Comparable<Hand>{
    
    private List<Card> hand;
    
    public Hand() {
        this.hand = new ArrayList<Card>();
    }
    
    public void add(Card card) {
        this.hand.add(card);
    }
    
    public void print() {
        for (Card c : hand) {
            System.out.println(c);
        }
    }
    
    public void sort() {
        Collections.sort(hand);
    }
    
    public List<Card> getHand() {
        return hand;
    }
    
    @Override
    public int compareTo(Hand other) {
        int this_sum = 0;
        int other_sum = 0;
        for (Card c : this.getHand()) {
            this_sum += c.getValue();
        }
        for (Card c : other.getHand()) {
            other_sum += c.getValue();
        }
        return this_sum - other_sum;
    }
    
    public void sortAgainstSuit() {
        Collections.sort(hand, new SortAgainstSuitAndValue());
    }
    
}
