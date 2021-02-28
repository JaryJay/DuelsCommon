package state;

import java.util.ArrayList;
import java.util.List;

import entity.Player;
import entity.Projectile;

public class GameState {

	private long time;

	private List<Player> players;
	private List<Projectile> projectiles;

	public GameState(long time) {
		this.time = time;
		init();
	}

	public long getTime() {
		return time;
	}

	public void init() {
		players = new ArrayList<>();
		projectiles = new ArrayList<>();
	}

	public List<Player> getPlayers() {
		return players;
	}

	public List<Projectile> getProjectiles() {
		return projectiles;
	}

	public GameState getNextState(float dt) {
		return null;
	}

}
