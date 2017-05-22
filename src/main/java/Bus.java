/**
 * Created by Rekdon on 26.04.2017.
 */
public class Bus extends Mashine {
    private int mass;
    private int numberOfPassengers;
    private int numberOfWheels;


    public Bus(String name, int speedNow) {
        super(name, speedNow);
    }

    public Bus(String name, int speedNow, int mass, int numberOfPassengers, int numberOfWheels) {
        super(name, speedNow);
        this.mass = mass;
        this.numberOfPassengers = numberOfPassengers;
        this.numberOfWheels = numberOfWheels;
    }


    public int getMass() {
        return mass;
    }


    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }


    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String checkPassengers(int numberOfPassengers) {
        if (numberOfPassengers + 1 > MAX_NUMBER_OF_PASSENGERS_IN_BUS) {
            return "Кількість людей в автобусі перевищує норму,автобус не готовий до відправки";
        } else {
            return "Кількість людей в автобусі не перевищує норму,автобус готовий до відправки";
        }
    }

    public String getInfo() {
        String result = "";
        return result + "          Інформація про автобус         " + "\n" +
                "Назва автобуса : " + getName() + "\n" +
                "швидкість в даний момент : " + getSpeed() + "\n" +
                "вага автобуса : " + getMass() + "\n" +
                "кількість пасажирів : " + getNumberOfPassengers() + "\n" +
                "кількість коліс : " + getNumberOfWheels() + "\n" +
                "перевірка на відправку : " + "\n" + "----------------------------------" + "\n" +
                checkPassengers(getNumberOfPassengers());
    }
}
