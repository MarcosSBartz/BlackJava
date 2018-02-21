/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjava;

import java.util.ArrayList;

/**
 *
 * @author marcos
 */
public class Player {

    private ArrayList<Card> hand;
    private int points;
    private int handSize;

    public Player() {
        hand = new ArrayList<Card>();
        this.points = 0;
        this.handSize = 0;
    }

    public void addCard(Card card) {
        points += card.getValue(card);
        hand.add(card);

    }

    public int getHandSize() {
        return handSize;
    }

    public void setHandSize(int handSize) {
        this.handSize = handSize;
    }

    public void clearHand() {
        hand.clear();
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return "Player{" + "hand=" + hand + ", points=" + points + '}';
    }

}
