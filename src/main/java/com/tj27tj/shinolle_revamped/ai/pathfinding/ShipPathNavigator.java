package com.tj27tj.shinolle_revamped.ai.pathfinding;

import net.minecraft.entity.MobEntity;
import net.minecraft.pathfinding.PathFinder;
import net.minecraft.pathfinding.PathNavigator;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import com.tj27tj.shinolle_revamped.entity.interfaces.IShipNavigator;

public class ShipPathNavigator extends PathNavigator {

    public ShipPathNavigator(MobEntity entityIn, World worldIn) {
        super(entityIn, worldIn);
    }

    @Override
    protected PathFinder getPathFinder(int p_179679_1_) {
        return null;
    }

    @Override
    protected Vector3d getEntityPosition() {
        return null;
    }

    /**
     * If on ground or swimming and can swim
     */
    @Override
    protected boolean canNavigate() {
        return false;
    }

    /**
     * Checks if the specified entity can safely walk to the specified location.
     *
     * @param posVec31
     * @param posVec32
     * @param sizeX
     * @param sizeY
     * @param sizeZ
     */
    @Override
    protected boolean isDirectPathBetweenPoints(Vector3d posVec31, Vector3d posVec32, int sizeX, int sizeY, int sizeZ) {
        return false;
    }
}
