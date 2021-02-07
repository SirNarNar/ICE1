/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author dancye & Peter Wyroba 
 * Modified Feb. 7, 2021
 */
public class CardTrick {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        Card[] magicHand = new Card[7];
        //Card userCard = new Card();
        Card luckyCard = new Card();
        
        luckyCard.setValue(1);
        luckyCard.setSuit("Spades");

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int) (Math.random() * 13));
            c.setSuit(Card.SUITS[(int) ((Math.random() * 4) - 1)]);
            magicHand[i] = c;
        }

        //System.out.print("Enter your card value(Ace = 1, Jack = 11, Queen =12, King = 13): ");
        //userCard.setValue(k.nextInt());
        //System.out.print("Enter your suit value(Hearts, Diamonds, Spades, Clubs): ");
        //userCard.setSuit(k.next());

        if ((magicHand[0].getSuit().equals(luckyCard.getSuit())) && (magicHand[0].getValue() == luckyCard.getValue())) {
            System.out.println("You won!");
        } else {
            if ((magicHand[1].getSuit().equals(luckyCard.getSuit())) && (magicHand[1].getValue() == luckyCard.getValue())) {
                System.out.println("You won!");
            } else {
                if ((magicHand[2].getSuit().equals(luckyCard.getSuit())) && (magicHand[2].getValue() == luckyCard.getValue())) {
                    System.out.println("You won!");
                } else {
                    if ((magicHand[3].getSuit().equals(luckyCard.getSuit())) && (magicHand[3].getValue() == luckyCard.getValue())) {
                        System.out.println("You won!");
                    } else {
                        if ((magicHand[4].getSuit().equals(luckyCard.getSuit())) && (magicHand[4].getValue() == luckyCard.getValue())) {
                            System.out.println("You won!");
                        } else {
                            if ((magicHand[5].getSuit().equals(luckyCard.getSuit())) && (magicHand[5].getValue() == luckyCard.getValue())) {
                                System.out.println("You won!");
                            } else {
                                if ((magicHand[6].getSuit().equals(luckyCard.getSuit())) && (magicHand[6].getValue() == luckyCard.getValue())) {
                                    System.out.println("You won!");
                                } else {
                                    System.out.println("You lost.");
                                }
                            }
                        }
                    }
                }
            }
        }
    }

}
