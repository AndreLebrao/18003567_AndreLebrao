package br.maua.game;

import java.util.List;

import br.maua.models.PicturePokerCard;
import br.maua.models.PicturePokerDeck;

public class PicturePoker {
    public static void run(){
        System.out.println("Mario Poker!");
        PicturePokerDealer dealer = new PicturePokerDealer("Luigi");
        System.out.println("Dealer: "+dealer.getName());
        PicturePokerDeck deck = new PicturePokerDeck();
        deck.createDeckList();

        PicturePokerHand hand = new PicturePokerHand(dealer.deal());
        System.out.println("\n\nMao Atual:");
        showPicturePokerDeckList(hand.getHand());

        // System.out.println("Baralho Atual:");
        // showPicturePokerDeckList(dealer.getDeck().getDeckList());
        System.out.println(hand.checkHand(hand.getHand())); 
    }

    private static void showPicturePokerDeckList(List<PicturePokerCard> cardList) {
        for (PicturePokerCard picturePokerCard : cardList) {
            System.out.println(picturePokerCard);
        }
    }
}