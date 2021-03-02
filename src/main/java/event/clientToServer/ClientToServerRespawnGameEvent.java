package event.clientToServer;

import common.event.GameEvent;
import common.source.GameSource;
import entity.Player;

public class ClientToServerRespawnGameEvent extends GameEvent {

	private static final long serialVersionUID = 1020077947876155559L;
	private Player player;

	public ClientToServerRespawnGameEvent(long time, GameSource source) {
		super(time, source);
	}

	public Player getPlayer() {
		return player;
	}

}
