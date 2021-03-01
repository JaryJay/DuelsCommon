package event;

import common.event.GameEvent;
import common.source.GameSource;
import entity.Player;

public class RespawnGameEvent extends GameEvent {

	private static final long serialVersionUID = 1020077947876155559L;
	private Player player;

	public RespawnGameEvent(long time, GameSource source) {
		super(time, source);
	}

	public Player getPlayer() {
		return player;
	}

}
