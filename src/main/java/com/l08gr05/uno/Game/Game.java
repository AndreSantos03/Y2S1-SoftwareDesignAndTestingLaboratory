package com.l08gr05.uno.Game;

import com.l08gr05.uno.decks_cards.Card;
import com.l08gr05.uno.decks_cards.Deck;
import com.l08gr05.uno.decks_cards.StackDeck;

import java.io.IOException;

public class Game {
    private Deck stackDeck;
    private Deck playedDeck;
    private Deck playerDeck;
    private Deck cpuDeck;

    public Game() throws IOException {
        stackDeck = new StackDeck();
        playedDeck = new Deck(stackDeck.drawFirst());
        playerDeck = new Deck(stackDeck.drawTop(7));
        cpuDeck = new Deck(stackDeck.drawTop(7));
    }

    public Deck get_stackDeck(){
        return stackDeck;
    }
    public Deck get_playerDeck(){
        return playerDeck;
    }
    public Deck get_cpuDeck(){
        return cpuDeck;
    }

    public Deck get_playedDeck() {
        return playedDeck;
    }

    public Card get_topCard(){
        return playedDeck.getTop();
    }

    public void setSelectStatus(int index, boolean select){
        playerDeck.get(index).setIsSelected(select);
    }
    public boolean playCardPlayer(int index){
        if(get_topCard().canCardBePlayedOver(playerDeck.get(index))){
            playerDeck.get(index).setIsSelected(false);
            playedDeck.addTop(playerDeck.remove(index));
            return true;
        }
        return false;
    }
}
