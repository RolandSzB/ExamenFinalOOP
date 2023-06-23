package promovare;

public abstract class Act {
	private static int ID_COUNTER = 0;
    private int id;

    public Act() {
        id = ++ID_COUNTER;
    }

    public int getId() {
        return id;
    }
}
