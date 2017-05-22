/**
 * Created by Rekdon on 24.04.2017.
 */
public class Airlaner extends Plane {
    public int numberOfStewardess;


    public Airlaner(String name, int speedNow) {
        super(name, speedNow);
    }

    public Airlaner(String name, int speedNow, int mass, int numberOfPassengers, int numberOfWheels, int numberOfPilots, int numberOfStewardess) {
        super(name, speedNow, mass, numberOfPassengers, numberOfWheels, numberOfPilots);
        this.numberOfStewardess = numberOfStewardess;
    }

    public int getNumberOfStewardess() {
        return numberOfStewardess;
    }

    public int getMaxMass(int mass) {
        return mass + getNumberOfPassengers() * 65 + numberOfStewardess * 55;
    }

    public double getMinSpeed(int speed, int numberOfPassengers) {
        return speed - ((numberOfPassengers * 0.5) + (numberOfStewardess * 0.4));
    }

    @Override
    public String toString() {
        return "          Інформація про літак         " + "\n" +
                "Пасажирський літак " + "\n" +
                "Назва літака : " + getName() + "\n" +
                "загальна вага літака : " + getMass() + "\n" +
                "кількість пасажирів : " + getNumberOfPassengers() + "\n" +
                "кількість коліс : " + getNumberOfWheels() + "\n" +
                "кількість пілотів : " + getNumberOfPilots() + "\n" +
                "кількість стьюардес : " + getNumberOfStewardess() + "\n" +
                "швидкість : " + getSpeed() + "\n" +
                "максимальна вага : " + getMaxMass(getMass()) + "\n" +
                checkPassengers(getNumberOfPassengers(), getNumberOfPilots());
    }
}
