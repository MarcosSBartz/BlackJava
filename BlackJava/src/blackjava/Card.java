/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjava;

/**
 *
 * @author marcos
 */
public class Card {

    public String suit;
    public String face;
    public int value;

    public Card(String faceIn, String suitIn) {
        this.face = faceIn;
        this.suit = suitIn;
    }

    public int getValue(Card card) {
        switch (card.face) {
            case "A":
                return 11;
            case "2":
                return 2;
            case "3":
                return 3;
            case "4":
                return 4;
            case "5":
                return 5;
            case "6":
                return 6;
            case "7":
                return 7;
            case "8":
                return 8;
            case "9":
                return 9;
            case "T":
                return 10;
            case "J":
                return 10;
            case "Q":
                return 10;
            case "K":
                return 10;
        }
        return 0;
    }

    @Override
    public String toString() {
        return face + suit;
    }

}
