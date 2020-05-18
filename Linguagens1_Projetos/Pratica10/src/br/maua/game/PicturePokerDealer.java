package br.maua.game;

import java.util.ArrayList;
import java.util.List;

import br.maua.models.PicturePokerCard;
import br.maua.models.PicturePokerDeck;

public class PicturePokerDealer {
    private String name;
    private PicturePokerDeck deck;

    public PicturePokerDealer(String name) {
        this.name = name;
        this.deck = new PicturePokerDeck();
    }
    
    public List<PicturePokerCard> deal(){
        List<PicturePokerCard> hand =new ArrayList<>();
        for (int card = 0; card <=4; card++) {
            hand.add(deck.getRandomCard());
        }
        return hand;
    }
    /**
     * @return the deck
     */
    public PicturePokerDeck getDeck() {
        return deck;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
}