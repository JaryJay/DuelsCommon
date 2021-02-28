package state;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import entity.Player;
import entity.Projectile;
import input.InputFrame;

public class GameState implements Serializable {

	private static final long serialVersionUID = 6943302012918667799L;

	private long frame;

	private List<Player> players;
	private List<Projectile> projectiles;

	public GameState(long frame) {
		this.frame = frame;
		init();
	}

	public long getTime() {
		return frame;
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

	public GameState getNextState(InputFrame inputFrame) {
		return null;
	}

}
