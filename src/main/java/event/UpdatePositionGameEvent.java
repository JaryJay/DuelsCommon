package event;

import common.event.GameEvent;
import common.source.GameSource;

public class UpdatePositionGameEvent extends GameEvent {

	public UpdatePositionGameEvent(long time, GameSource source) {
		super(time, source);
	}

}
