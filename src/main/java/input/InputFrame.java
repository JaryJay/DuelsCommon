package input;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import bundle.input.event.AbstractGameInputEvent;

public class InputFrame implements Serializable {

	private static final long serialVersionUID = -6840708366397987969L;

	public List<AbstractGameInputEvent> inputs = new ArrayList<>();

}
