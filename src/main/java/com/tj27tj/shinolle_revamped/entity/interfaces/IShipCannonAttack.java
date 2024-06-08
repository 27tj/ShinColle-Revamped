package com.tj27tj.shinolle_revamped.entity.interfaces;

import net.minecraft.entity.Entity;

public interface IShipCannonAttack extends IShipAttackBase {

    boolean attackEntityWithAmmo(Entity target);

    /**
     * Use heavy ammo to attack
     */
    boolean attackEntityWithHeavyAmmo(Entity target);

    /**
     * Use ammo type
     */
    boolean useAmmoLight();

    boolean useAmmoHeavy();

}
