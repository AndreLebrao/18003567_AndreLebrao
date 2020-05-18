package br.maua.models;

public class PicturePokerCard {
    private PicturePokerCardValues value;
    private int id;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    /**
     * @return the value
     */
    public PicturePokerCardValues getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "PicturePokerCard [id=" + id + ", value=" + value + "]";
    }

    public PicturePokerCard(PicturePokerCardValues value, int id) {
        this.value = value;
        this.id = id;
    }
    
}