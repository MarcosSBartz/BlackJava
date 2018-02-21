/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjava;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author marcos
 */
public class Deck {

    private ArrayList<Card> deck;
    String suits[] = {"h", "c", "d", "s"};
    String faces[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K"};

    public Deck() {
        deck = new ArrayList<Card>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                deck.add(new Card(faces[j], suits[i]));
            }
        }
    }

    public void displayDeck() {
        for (Card card : deck) {
            System.out.println(card.suit + card.face);
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(deck);
    }

    public Card dealCard(int posicao) {
        return (deck.get(posicao));
    }

}
