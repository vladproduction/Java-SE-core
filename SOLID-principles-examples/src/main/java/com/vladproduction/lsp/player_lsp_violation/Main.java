package com.vladproduction.lsp.player_lsp_violation;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Player> playerList = new ArrayList<>();
        playerList.add(new TorPlayer());
        playerList.add(new VlcPlayer());
        playAllPlayers(playerList);
        System.out.println("-------------------------");
        playerList.add(new WinampPlayer());
        playAllPlayers(playerList);
    }

    private static void playAllPlayers(List<Player> playerList) {
        for (Player player : playerList) {
            player.playVideo();
        }
    }
}
