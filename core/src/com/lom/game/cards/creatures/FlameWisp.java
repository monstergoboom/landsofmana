package com.lom.game.cards.creatures;

import com.lom.game.cards.CreatureCard;

/**
 * Created by Alek on 2/26/2016.
 */
public class FlameWisp extends CreatureCard {
    public FlameWisp() {
        setName("FlameWisp");
        setFaction("None");
        setFamily("Magical");
        setProfession("None");

        setHealth(2);
        setMana(0);
        setPlayCost(1);
        setLevel(1);
        setAttack(1);

        setSubTypeLevel("Fire", 1);
    }
}
