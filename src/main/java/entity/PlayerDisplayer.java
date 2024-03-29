package entity;

import bundle.visuals.display.AbstractDisplayer;
import bundle.visuals.renderer.AbstractGameRenderer;
import common.coordinates.Vector2f;

public class PlayerDisplayer extends AbstractDisplayer<Player> {

	public PlayerDisplayer(AbstractGameRenderer renderer) {
		super(renderer);
	}

	@Override
	public void display(Player displayable) {
		Vector2f position = displayable.getPosition();
//		Vector2f direction = displayable.getDirection();
		renderer.fill(150, 150, 150);
		renderer.drawEllipse(position.x, position.y, Player.HITBOX_RADIUS, Player.HITBOX_RADIUS);
		renderer.outlineColour(0, 0, 0);
//		renderer.text(displayable.getName(), position.x, position.y - 20);
	}

	@Override
	public void display(Player displayable, float alpha) {
		Vector2f position = displayable.getPosition();
		Vector2f direction = displayable.getDirection();
		float speed = displayable.getSpeed();
		renderer.fill(150, 150, 150);
//		renderer.drawEllipse(position.copy().scale(speed).x + direction.x * speed * alpha, position.copy().scale(speed).y + direction.y * speed * alpha, Player.HITBOX_RADIUS, Player.HITBOX_RADIUS);
//		renderer.drawEllipse(position.x + direction.x * speed * alpha, position.y + direction.y * speed * alpha, Player.HITBOX_RADIUS, Player.HITBOX_RADIUS);
		renderer.drawEllipse(position.x * speed + direction.x * speed * alpha, position.y + direction.y * speed * alpha, Player.HITBOX_RADIUS, Player.HITBOX_RADIUS);
		renderer.outlineColour(0, 0, 0);
	}

}
