package com.lom.game.cards;
import java.util.HashMap;

/**
 * Created by Alek on 2/25/2016.
 */
public class Leader extends BaseCard {
    private String faction;
    private int health;
    private int mana;
    private float regen;
    private int influence;

    private HashMap<String, Integer> proficiency;

    public Leader() {
        this.faction = "None";
        this.health = 0;
        this.mana = 0;
        this.regen = 0;
        this.influence = 0;
        this.proficiency = new HashMap<String, Integer>();
    }

    public String getFaction() { return this.faction; }
    public void setFaction(String value) { this.faction = value; }

    public int getHealth() { return this.health; }
    public void setHealth(int value) { this.health = value; }

    public int getMana() { return this.mana; }
    public void setMana(int value) { this.mana = value; }

    public float getRegen() { return this.regen; }
    public void setRegen(float value) { this.regen = value; }

    public int getInfluence() { return this.influence; }
    public void setInfluence(int value) { this.influence = value; }

    public int getProficiency(String proficiencyType) {
        return this.proficiency.getOrDefault(proficiencyType, 0);
    }

    public void setProficiency(String proficiencyType, int value) {
        this.proficiency.put(proficiencyType, value);
    }
}
