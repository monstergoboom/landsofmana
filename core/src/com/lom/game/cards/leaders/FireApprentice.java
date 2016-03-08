package com.lom.game.cards.leaders;

import com.lom.game.cards.LeaderCard;

/**
 * Created by Alek on 2/26/2016.
 */
public class FireApprentice extends LeaderCard {
    public FireApprentice() {
        setName("FireApprentice");
        setFaction("WizardsTower");
        setHealth(20);
        setMana(20);
        setRegen(2f);
        setInfluence(100);

        setProficiency("Fire", 5);
        setProficiency("Pure", 5);
    }
}
