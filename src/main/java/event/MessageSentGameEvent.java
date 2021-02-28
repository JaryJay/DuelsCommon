package event;

import common.event.GameEvent;
import common.source.GameSource;

public class MessageSentGameEvent extends GameEvent {

	private static final long serialVersionUID = -30334008891265989L;
	private String message;

	public MessageSentGameEvent(String message, long time, GameSource source) {
		super(time, source);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
