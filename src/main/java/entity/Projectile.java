package entity;

import java.io.Serializable;

import bundle.visuals.display.AbstractDisplayer;
import bundle.visuals.display.Displayable;
import common.coordinates.Vector2f;
import common.entity.AbstractEntity;

public class Projectile extends AbstractEntity implements Displayable, Serializable {

	private static final long serialVersionUID = 5207503226422903552L;
	private Vector2f position;
	private Vector2f velocity;
	private float radius;

	public Projectile(long id) {
		super(id);
	}

	public Vector2f getPosition() {
		return position;
	}

	public Vector2f getVelocity() {
		return velocity;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	@Override
	public Class<? extends AbstractDisplayer<Projectile>> getDisplayerClass() {
		return ProjectileDisplayer.class;
	}

}
