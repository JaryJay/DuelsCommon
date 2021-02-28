package input;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import bundle.input.event.AbstractGameInputEvent;

public class InputFrame implements Serializable {

	private static final long serialVersionUID = -6840708366397987969L;

	public Set<AbstractGameInputEvent> inputs = new HashSet<>();

}
