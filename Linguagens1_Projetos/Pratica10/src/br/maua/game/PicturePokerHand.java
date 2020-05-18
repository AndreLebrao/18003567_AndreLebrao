package br.maua.game;

import java.util.HashMap;
import java.util.List;

import br.maua.interfaces.PicturePokerCheckHand;
import br.maua.models.PicturePokerCard;
import br.maua.models.PicturePokerCardValues;
import br.maua.models.PicturePokerHandValues;

public class PicturePokerHand implements PicturePokerCheckHand {
    private List<PicturePokerCard> hand;

    public PicturePokerHand(List<PicturePokerCard> hand) {
        this.hand = hand;
    }

    /**
     * @return the hand
     */
    public List<PicturePokerCard> getHand() {
        return hand;
    }

    @Override
    public PicturePokerHandValues checkHand(List<PicturePokerCard> cardList) {
        PicturePokerHandValues handValue = PicturePokerHandValues.NONE;
        
        HashMap<PicturePokerCardValues, Integer> handMap = new HashMap<>();

        for (PicturePokerCardValues value : PicturePokerCardValues.values()) {
            handMap.put(value, 0);
        }
        for (PicturePokerCard card : cardList) {
            handMap.replace(card.getValue(),handMap.get(card.getValue())+1);
        }

        if(handMap.containsValue(5))
            handValue = PicturePokerHandValues.FLUSH;
        else if(handMap.containsValue(4))
            handValue = PicturePokerHandValues.FOUR_OF_A_KIND;
        else if(handMap.containsValue(3) && handMap.containsValue(2))
            handValue = PicturePokerHandValues.FULL_HOUSE;
        else if(handMap.containsValue(3))
            handValue = PicturePokerHandValues.THREE_OF_A_KIND;
        else if(handMap.containsValue(2)){
            handValue = PicturePokerHandValues.TWO_PAIRS;
            int pairCount = 0;
            for (int value : handMap.values()) {
                if (value == 2) pairCount++;
            }
            if(pairCount == 2)
                handValue = PicturePokerHandValues.TWO_PAIRS;
            if(pairCount == 1)
                handValue = PicturePokerHandValues.ONE_PAIR;
        else
            handValue = PicturePokerHandValues.ONE_PAIR;

        }
        
        return handValue;
    }
}