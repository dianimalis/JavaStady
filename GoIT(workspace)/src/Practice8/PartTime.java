package Practice8;

/**
 * Created by MARIA on 23.10.17.
 */
public class PartTime extends Workers {

    private int rate = 100;

    public PartTime(String name, String lastName) {
        super(name, lastName);
    }

    @Override
    public double salary() {
        return (20.8 * 8 * rate);
    }
}
