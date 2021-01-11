package br.maua.interfaces;

import java.util.List;

import br.maua.models.PicturePokerCard;

import br.maua.models.PicturePokerHandValues;

public interface PicturePokerCheckHand {
    PicturePokerHandValues checkHand(List<PicturePokerCard> cardList);
}