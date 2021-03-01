package entity;

import java.io.Serializable;

import bundle.visuals.display.AbstractDisplayer;
import bundle.visuals.display.Displayable;
import common.coordinates.Vector2f;
import input.InputFrame;

public class Projectile extends IntegrableEntity implements Displayable, Serializable {

	private static final long serialVersionUID = -6193252090769980787L;
	private Vector2f position;
	private Vector2f direction;
	private float radius;

	public Projectile(long id) {
		super(id);
	}

	@Override
	public Projectile integrate(InputFrame inputFrame) {
		Projectile integratedProjectile = new Projectile(getId());
		integratedProjectile.getPosition().set(position.copy().add(direction));
		integratedProjectile.getDirection().set(direction);
		return integratedProjectile;
	}

	public Vector2f getPosition() {
		return position;
	}

	public Vector2f getDirection() {
		return direction;
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
