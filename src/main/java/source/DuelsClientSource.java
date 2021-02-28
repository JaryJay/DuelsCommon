package source;

import common.source.GameSource;

public class DuelsClientSource implements GameSource {

	private static final long serialVersionUID = -482372584226448557L;
	private long id;

	public DuelsClientSource(long id) {
		this.id = id;
	}

	@Override
	public long getId() {
		return id;
	}

	@Override
	public String getDescription() {
		return "Client Source";
	}

}
