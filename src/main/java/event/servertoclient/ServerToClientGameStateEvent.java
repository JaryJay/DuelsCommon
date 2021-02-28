package event.servertoclient;

import java.util.List;

import common.event.GameEvent;
import input.InputFrame;
import source.DuelsServerSource;
import state.GameState;

public class ServerToClientGameStateEvent extends GameEvent {

	private static final long serialVersionUID = -8361747575746913815L;

	private GameState state;
	private List<InputFrame> inputFrames;

	public ServerToClientGameStateEvent(GameState state, List<InputFrame> inputFrames) {
		super(new DuelsServerSource());
		this.state = state;
		this.inputFrames = inputFrames;
	}

	public GameState getState() {
		return state;
	}

	public List<InputFrame> getInputFrames() {
		return inputFrames;
	}

}
