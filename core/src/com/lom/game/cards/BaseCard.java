package com.lom.game.cards;
import java.util.UUID;

/**
 * Created by Alek on 2/25/2016.
 */
public class BaseCard {
    private UUID id;
    private String name;
    private int playCost;
    private int level;

    // unique identifer per card instance 1st soldier, etc..
    public UUID getId() { return this.id; }

    // unique identifier per card soldier
    public String getName() { return this.name; }
    public void setName(String value) { this.name = value; }

    // the value attributed to the cost to play the card onto the table
    public int getPlayCost() { return this.playCost; }
    public void setPlayCost(int value) { this.playCost = value; }

    // card level requirement
    public int getLevel() { return this.level; }
    public void setLevel(int value) { this.level = value; }

    public BaseCard() {
        id = UUID.randomUUID();
    }
}
