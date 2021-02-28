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

	private List<Player> players = new ArrayList<>();
	private List<Projectile> projectiles = new ArrayList<>();

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
		GameState nextState = new GameState(frame + 1);
		for (Player player : players) {
			nextState.players.add(player);
		}
		for (Projectile projectile : projectiles) {
			nextState.projectiles.add(projectile);
		}
		return nextState;
	}

	public void addPlayer(long id) {
		players.add(new Player(id));
	}

	public void removePlayer(long id) {
		List<Player> newPlayers = new ArrayList<>();
		for (Player player : players) {
			if (player.getId() != id) {
				newPlayers.add(player);
			}
		}
		players = newPlayers;
	}

}
