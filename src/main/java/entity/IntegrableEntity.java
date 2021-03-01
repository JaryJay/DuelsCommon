package entity;

import java.io.Serializable;

import common.entity.AbstractEntity;
import input.InputFrame;

public abstract class IntegrableEntity extends AbstractEntity implements Serializable {

	private static final long serialVersionUID = 2204827613526291202L;

	public IntegrableEntity(long id) {
		super(id);
	}

	public abstract IntegrableEntity integrate(InputFrame inputFrame);

}
