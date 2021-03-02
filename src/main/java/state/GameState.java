package state;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import entity.Player;
import entity.Projectile;
import input.InputFrame;

public class GameState implements Serializable {

	private static final long serialVersionUID = -7082784099582626482L;

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
		List<Player> integratedPlayers = new ArrayList<>();
		List<Projectile> integratedProjectiles = new ArrayList<>();
		for (Player player : players) {
			integratedPlayers.add(player.integrate(inputFrame));
		}
		for (Projectile projectile : projectiles) {
			integratedProjectiles.add(projectile.integrate(inputFrame));
		}
		nextState.players.addAll(integratedPlayers);
		nextState.projectiles.addAll(integratedProjectiles);
		return nextState;
	}

	public Player getPlayer(long id) {
		for (Player player : players) {
			if (player.getId() != id) {
				return player;
			}
		}
		return null;
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
