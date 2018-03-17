package Practice8;

/**
 * Created by MARIA on 23.10.17.
 */
abstract public class Workers {
    private String name;
    private String lastName;

    public Workers(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    abstract public double salary();
}
