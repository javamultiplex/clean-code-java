package com.javamultiplex.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Rohit Agarwal on 31/08/20 11:29 pm
 * @copyright www.javamultiplex.com
 */
public class PlayerFactory {
    private static final Map<PlayerType, Player> playerMap = new HashMap<>();

    public static Player getPlayer(PlayerType type) {
        Player p = null;
        if (playerMap.containsKey(type)) {
            p = playerMap.get(type);
        } else {
            switch (type) {
                case TERRORIST:
                    p = new Terrorist();
                    break;
                case COUNTER_TERRORIST:
                    p = new CounterTerrorist();
                    break;
                default:
                    throw new IllegalArgumentException("Player type : " + type + " is invalid");
            }
            playerMap.put(type, p);
        }
        return p;
    }
}
