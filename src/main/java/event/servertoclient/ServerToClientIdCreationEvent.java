package event.servertoclient;

import common.event.GameEvent;
import source.DuelsServerSource;

public class ServerToClientIdCreationEvent extends GameEvent {

	private static final long serialVersionUID = -6380842231729034211L;

	private long id;

	public ServerToClientIdCreationEvent(long id) {
		super(new DuelsServerSource());
		this.id = id;
	}

	public long getId() {
		return id;
	}

}
