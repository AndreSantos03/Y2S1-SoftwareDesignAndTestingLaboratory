package com.l08gr05.uno.controller.game;

import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.l08gr05.uno.Application;
import com.l08gr05.uno.Game.Game;

import java.util.concurrent.Flow;

public class DrawController extends GameController{
    public DrawController(Game game){
        super(game);
    }
    private void cpuDraw(){
        getModel().get_cpuDeck().addTop(getModel().get_stackDeck().drawTop());
    }
    private void playerDraw(){
        getModel().get_playerDeck().addTop(getModel().get_stackDeck().drawTop());
    }
    public void step(Application application, KeyStroke keyStroke){
        if(FlowController.getPlayerTurn()){
            if(keyStroke.getKeyType() == KeyType.Enter){
                playerDraw();
            }
        }
        else{
            cpuDraw();
        }
    }
}
