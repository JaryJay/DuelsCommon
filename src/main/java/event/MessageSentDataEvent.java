package event;

import common.event.GameEvent;
import common.source.GameSource;

public class MessageSentDataEvent extends GameEvent {

	private String message;

	public MessageSentDataEvent(String message, long time, GameSource source) {
		super(time, source);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
