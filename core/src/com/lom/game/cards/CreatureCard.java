package com.lom.game.cards;

import com.lom.game.cards.BaseCard;
import java.util.HashMap;

/**
 * Created by Alek on 2/25/2016.
 */
public class CreatureCard extends BaseCard {
    private String faction;
    private String family;
    private String profession;

    private int health;
    private int mana;
    private int attack;
    private HashMap<String, Integer> subTypeLevel;

    public CreatureCard() {
        this.faction = "None";
        this.family = "None";
        this.profession = "None";
        this.health = 0;
        this.mana = 0;
        this.attack = 0;
        this.subTypeLevel = new HashMap<String, Integer>();
    }

    public String getFaction() { return this.faction; }
    public void setFaction(String value) { this.faction = value; }

    public String getFamily() { return this.family; }
    public void setFamily(String value) { this.family = value; }

    public String getProfession() { return this.profession; }
    public void setProfession(String value) { this.profession = value; }

    public int getHealth() { return this.health; }
    public void setHealth(int value) { this.health = value; }

    public int getMana() { return this.mana; }
    public void setMana(int value) { this.mana = value; }

    public int getAttack() { return this.attack; }
    public void setAttack(int value) { this.attack = value; }

    public int getSubTypeLevel(String subType) {
        return this.subTypeLevel.get(subType);
    }

    public void setSubTypeLevel(String subType, int value) {
        this.subTypeLevel.put(subType, value);
    }

    public int getAffluenza() {
        return this.getLevel();
    }
}
