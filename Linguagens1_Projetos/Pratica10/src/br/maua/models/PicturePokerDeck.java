package br.maua.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PicturePokerDeck {
    private List<PicturePokerCard> deckList;

    public PicturePokerDeck() {
        this.deckList = createDeckList();
    }

    public List<PicturePokerCard> createDeckList() {
        List<PicturePokerCard> newDeck = new ArrayList<>();
        for (PicturePokerCardValues value : PicturePokerCardValues.values()) {
            for (int myID = 1; myID <= 5; myID++) {
                newDeck.add(new PicturePokerCard(value,myID));
            }
        }
        
        return newDeck;
    }
    /**
     * @return the deckList
     */
    public List<PicturePokerCard> getDeckList() {
        return deckList;
    }

    public PicturePokerCard getRandomCard(){
        return deckList.remove(new Random().nextInt(deckList.size()));
    }
    
}