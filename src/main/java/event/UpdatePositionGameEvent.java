package event;

import common.event.GameEvent;
import common.source.GameSource;

public class UpdatePositionGameEvent extends GameEvent {

	private static final long serialVersionUID = -9150907298732338701L;

	public UpdatePositionGameEvent(long time, GameSource source) {
		super(time, source);
	}

}
