package com.l08gr05.uno.viewer;

import com.l08gr05.uno.decks_cards.Card;

public class CardViewer {

    private Position position;
    private Card card;
    private static int length;
    private static int width;

    public CardViewer(Position position, Card card) {
        this.position = position;
        this.card = card;
    }
}
