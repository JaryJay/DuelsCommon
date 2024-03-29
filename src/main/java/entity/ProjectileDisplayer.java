package entity;

import bundle.visuals.display.AbstractDisplayer;
import bundle.visuals.renderer.AbstractGameRenderer;
import common.coordinates.Vector2f;

public class ProjectileDisplayer extends AbstractDisplayer<Projectile> {

	public ProjectileDisplayer(AbstractGameRenderer renderer) {
		super(renderer);
	}

	@Override
	public void display(Projectile displayable) {
		Vector2f position = displayable.getPosition();
		float radius = displayable.getRadius();
//		Vector2f direction = displayable.getDirection();
		renderer.fill(150, 150, 150);
		renderer.drawEllipse(position.x, position.y, radius, radius);
	}

	@Override
	public void display(Projectile displayable, float alpha) {
		Vector2f position = displayable.getPosition();
		Vector2f direction = displayable.getDirection();
		renderer.fill(150, 150, 150);
		renderer.drawEllipse(position.x + direction.x * alpha, position.y + direction.y * alpha, Player.HITBOX_RADIUS, Player.HITBOX_RADIUS);
		renderer.outlineColour(0, 0, 0);
	}

}
