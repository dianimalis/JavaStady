package Practice8;

/**
 * Created by MARIA on 23.10.17.
 */
public class FullTime extends Workers {
    private int monthlyRate = 25000;

    public FullTime(String name, String lastName) {
        super(name, lastName);
    }

    @Override
    public double salary() {
        return monthlyRate;
    }
}
