/**
 * Created by Rekdon on 24.04.2017.
 */
public abstract class Mashine implements IRun {
    final int MAX_SPEED = 300;
    final int MIN_SPEED = 0;
    final int MIN_NUMBER_OF_PASSENGERS = 1;
    final int MAX_NUMBER_OF_PASSENGERS_IN_PLANE = 50;
    final int MAX_NUMBER_OF_PASSENGERS_IN_BUS = 30;
    private String name;
    private int speedNow;

    public Mashine(String name, int speedNow) {
        this.name = name;
        this.speedNow = speedNow;
    }

    public String outputName(String name) {
        return name;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speedNow;
    }
}
