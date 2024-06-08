package com.tj27tj.shinolle_revamped.ai.goal;

import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.ai.goal.RangedAttackGoal;

public class ShipCannonAttackGoal extends RangedAttackGoal {

    public ShipCannonAttackGoal(IRangedAttackMob attacker, double movespeed, int minAttackTime, int maxAttackTime, float maxAttackDistanceIn) {
        super(attacker, movespeed, minAttackTime, maxAttackTime, maxAttackDistanceIn);
    }
}
