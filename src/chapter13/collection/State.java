package chapter13.collection;

public enum State {

	OPEN(10), IN_PROGRESS(20), READY_TO_TEST(3), REJECT(9), DONE(7);

	private int dbValue;

	State(int dbValue) {
		this.dbValue = dbValue;
	}

	public int getDbValue() {
		return dbValue;
	}

	public static State valueOf(int dbValue) {

		for (State s : State.values()) {
			if (s.getDbValue() == dbValue) {
				return s;
			}
		}

		return null;
	}

}
