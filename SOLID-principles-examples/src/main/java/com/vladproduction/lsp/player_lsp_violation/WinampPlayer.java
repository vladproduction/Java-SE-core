package com.vladproduction.lsp.player_lsp_violation;

public class WinampPlayer extends Player{


    public void playVideo(){
        try {
            throw new VideoUnsupportedException();
        } catch (VideoUnsupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
