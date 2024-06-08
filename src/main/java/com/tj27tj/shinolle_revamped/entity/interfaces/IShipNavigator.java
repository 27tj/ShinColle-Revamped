package com.tj27tj.shinolle_revamped.entity.interfaces;



public interface IShipNavigator {
    public ShipPathNavigate getShipNavigate();

	/** ship move helper */
	public ShipMoveHelper getShipMoveHelper();

	/** can entity fly flag */
	public boolean canFly();

	/** entity is jumping */
	public boolean isJumping();

	/** move speed */
	public float getMoveSpeed();

	/** jump strength */
	public float getJumpSpeed();
}
