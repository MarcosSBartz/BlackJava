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
        switch (face) {
            case "A":
                this.value = 1;
            case "2":
                this.value = 2;
            case "3":
                this.value = 3;
            case "4":
                this.value = 4;
            case "5":
                this.value = 5;
            case "6":
                this.value = 6;
            case "7":
                this.value = 7;
            case "8":
                this.value = 8;
            case "9":
                this.value = 9;
            case "T":
                this.value = 10;
            case "J":
                this.value = 10;
            case "Q":
                this.value = 10;
            case "K":
                this.value = 1;
        }
    }
}
