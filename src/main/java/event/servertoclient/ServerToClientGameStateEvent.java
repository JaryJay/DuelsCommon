package event.servertoclient;

import java.util.List;

import common.event.GameEvent;
import input.InputFrame;
import source.DuelsServerSource;
import state.GameState;

public class ServerToClientGameStateEvent extends GameEvent {

	private static final long serialVersionUID = -1637570572582872053L;

	private long frame;
	private GameState state;
	private List<InputFrame> inputFrames;

	public ServerToClientGameStateEvent(GameState state, List<InputFrame> inputFrames, long frame, long time) {
		super(time, new DuelsServerSource());
		this.state = state;
		this.inputFrames = inputFrames;
		this.frame = frame;
	}

	public long getFrame() {
		return frame;
	}

	public GameState getState() {
		return state;
	}

	public List<InputFrame> getInputFrames() {
		return inputFrames;
	}

}
