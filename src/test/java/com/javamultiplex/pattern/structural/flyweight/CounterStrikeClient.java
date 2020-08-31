package com.javamultiplex.pattern.structural.flyweight;

import org.junit.jupiter.api.Test;

import java.util.Random;

/**
 * @author Rohit Agarwal on 31/08/20 11:36 pm
 * @copyright www.javamultiplex.com
 */
public class CounterStrikeClient {

    @Test
    public void shouldCreatePlayers() {
        for (int i = 0; i < 10; i++) {
            Player p = PlayerFactory.getPlayer(getRandPlayerType());
            p.assignWeapon(getRandWeapon());
            p.mission();
        }
    }

    private String getRandWeapon() {
        String[] weapons =
                {"AK-47", "Maverick", "Gut Knife", "Desert Eagle"};
        Random random = new Random();
        int index = random.nextInt(weapons.length);
        return weapons[index];
    }

    private PlayerType getRandPlayerType() {
        PlayerType[] playerType =
                {PlayerType.COUNTER_TERRORIST, PlayerType.TERRORIST};
        Random random = new Random();
        int index = random.nextInt(playerType.length);
        return playerType[index];
    }
}
