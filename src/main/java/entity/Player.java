package entity;

import java.awt.event.KeyEvent;
import java.io.Serializable;

import bundle.input.event.AbstractGameInputEvent;
import bundle.input.event.KeyPressedInputEvent;
import bundle.input.event.KeyReleasedInputEvent;
import bundle.visuals.display.AbstractDisplayer;
import bundle.visuals.display.Displayable;
import common.coordinates.Vector2f;
import common.source.GameSource;
import input.InputFrame;

public class Player extends IntegrableEntity implements Displayable, Serializable {

	private static final long serialVersionUID = -7052939609205262533L;
	public static final int MAX_HEALTH = 100;
	public static final int HITBOX_RADIUS = 10;

	private Vector2f position = new Vector2f(0, 0);
	private Vector2f direction = new Vector2f(0, 0);
	private float speed;
	private int health;
	private String name;

	public Player(long id) {
		super(id);
	}

	@Override
	public Player integrate(InputFrame inputFrame) {
		Player integratedPlayer = new Player(getId());

		integratedPlayer.getPosition().set(position);
		Vector2f iDirection = integratedPlayer.getDirection();
		iDirection.set(direction);

		for (AbstractGameInputEvent event : inputFrame.inputs) {
			GameSource source = event.getSource();
			if (source.getId() == getId()) {
				if (event instanceof KeyPressedInputEvent) {
					switch (((KeyPressedInputEvent) event).getKeyCode()) {
						case KeyEvent.VK_W:
							iDirection.y = Math.max(-1, iDirection.y - 1);
							break;
						case KeyEvent.VK_A:
							iDirection.x = Math.max(-1, iDirection.x - 1);
							break;
						case KeyEvent.VK_S:

							iDirection.y = Math.min(1, iDirection.y + 1);
							break;
						case KeyEvent.VK_D:
							iDirection.x = Math.min(1, iDirection.x + 1);
							break;
						default:
							break;
					}
				}
				if (event instanceof KeyReleasedInputEvent) {
					switch (((KeyReleasedInputEvent) event).getKeyCode()) {
						case KeyEvent.VK_W:
							iDirection.y = Math.min(1, iDirection.y + 1);
							break;
						case KeyEvent.VK_A:
							iDirection.x = Math.min(1, iDirection.x + 1);
							break;
						case KeyEvent.VK_S:

							iDirection.y = Math.max(-1, iDirection.y - 1);
							break;
						case KeyEvent.VK_D:
							iDirection.x = Math.max(-1, iDirection.x - 1);
							break;
						default:
							break;
					}
				}
			}
		}
		integratedPlayer.getPosition().add(direction);
		return integratedPlayer;
	}

	@Override
	public Class<? extends AbstractDisplayer<Player>> getDisplayerClass() {
		return PlayerDisplayer.class;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public Vector2f getPosition() {
		return position;
	}

	public Vector2f getDirection() {
		return direction;
	}

	public String getName() {
		return name;
	}

}
