package event.clientToServer;

import common.event.GameEvent;
import common.source.GameSource;
import entity.Player;
import entity.Projectile;

public class ClientToServerSpawnProjectileEvent extends GameEvent {

	private static final long serialVersionUID = -7922955418895450262L;
	private Player projectileFirer;
	private Projectile projectile;

	public ClientToServerSpawnProjectileEvent(Projectile projectile, Player projectileFirer, GameSource source) {
		super(source);
		this.projectile = projectile;
		this.projectileFirer = projectileFirer;
	}

	public Player getProjectileFirer() {
		return projectileFirer;
	}

	public Projectile getProjectile() {
		return projectile;
	}

}
