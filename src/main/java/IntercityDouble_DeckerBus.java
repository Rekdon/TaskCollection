/**
 * Created by Rekdon on 26.04.2017.
 */
public class IntercityDouble_DeckerBus extends Bus {
    private int numberOfDrivers;
    private String routeName;

    public IntercityDouble_DeckerBus(String name, int speedNow) {
        super(name, speedNow);
    }

    public IntercityDouble_DeckerBus(String name, int speedNow, int mass, int numberOfPassengers, int numberOfWheels) {
        super(name, speedNow, mass, numberOfPassengers, numberOfWheels);
    }

    public IntercityDouble_DeckerBus(String name, int speedNow, int numberOfDrivers, String routeName) {
        super(name, speedNow);
        this.numberOfDrivers = numberOfDrivers;
        this.routeName = routeName;
    }

    public IntercityDouble_DeckerBus(String name, int speedNow, int mass, int numberOfPassengers, int numberOfWheels, int numberOfDrivers, String routeName) {
        super(name, speedNow, mass, numberOfPassengers, numberOfWheels);
        this.numberOfDrivers = numberOfDrivers;
        this.routeName = routeName;
    }

    public int getNumberOfDrivers() {
        return numberOfDrivers;
    }

    public String getRouteName() {
        return routeName;
    }

    public String checkPassengers(int numberOfPassengers) {
        if (numberOfPassengers + 1 > 2 * MAX_NUMBER_OF_PASSENGERS_IN_BUS) {
            return "Кількість людей в автобусі перевищує норму,автобус не готовий до відправки";
        } else {
            return "Кількість людей в автобусі не перевищує норму,автобус готовий до відправки";
        }
    }

    public String getInfo() {
        String result = "";
        return result + "          Інформація про автобус         " + "\n" +
                "Міжміський двоповерховий автобус " + "\n" +
                "Назва автобуса : " + getName() + "\n" +
                "Назва маршруту : " + getRouteName() + "\n" +
                "Кількість водіїів : " + getNumberOfDrivers() + "\n" +
                "швидкість в даний момент : " + getSpeed() + "\n" +
                "вага автобуса : " + getMass() + "\n" +
                "кількість пасажирів : " + getNumberOfPassengers() + "\n" +
                "кількість коліс : " + getNumberOfWheels() + "\n" +
                "перевірка на відправку : " + "\n" + "----------------------------------" + "\n" +
                checkPassengers(getNumberOfPassengers());
    }
}
