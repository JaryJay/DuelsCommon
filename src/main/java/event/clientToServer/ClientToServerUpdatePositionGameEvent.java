package event.clientToServer;

import common.event.GameEvent;
import common.source.GameSource;

public class ClientToServerUpdatePositionGameEvent extends GameEvent {

	private static final long serialVersionUID = 1114040264595526082L;

	public ClientToServerUpdatePositionGameEvent(long time, GameSource source) {
		super(time, source);
	}

}
