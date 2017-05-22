/**
 * Created by Rekdon on 26.04.2017.
 */
public class UrbanBus extends Bus {
    private String beginningOfRouteName;
    private String endOfRouteName;

    public UrbanBus(String name, int speedNow) {
        super(name, speedNow);
    }

    public UrbanBus(String name, int speedNow, int mass, int numberOfPassengers, int numberOfWheels) {
        super(name, speedNow, mass, numberOfPassengers, numberOfWheels);
    }

    public UrbanBus(String name, int speedNow, String beginningOfRouteName, String endOfRouteName) {
        super(name, speedNow);
        this.beginningOfRouteName = beginningOfRouteName;
        this.endOfRouteName = endOfRouteName;
    }

    public UrbanBus(String name, int speedNow, int mass, int numberOfPassengers, int numberOfWheels, String beginningOfRouteName, String endOfRouteName) {
        super(name, speedNow, mass, numberOfPassengers, numberOfWheels);
        this.beginningOfRouteName = beginningOfRouteName;
        this.endOfRouteName = endOfRouteName;
    }

    public String getBeginningOfRouteName() {
        return beginningOfRouteName;
    }

    public String getEndOfRouteName() {
        return endOfRouteName;
    }

    public String checkPassengers(int numberOfPassengers) {
        if (numberOfPassengers + 1 > 1.5 * MAX_NUMBER_OF_PASSENGERS_IN_BUS) {
            return "Кількість людей в автобусі перевищує норму,автобус не готовий до відправки";
        } else {
            return "Кількість людей в автобусі не перевищує норму,автобус готовий до відправки";
        }
    }

    public String getInfo() {
        String result = "";
        return result + "          Інформація про автобус         " + "\n" +
                "Міський автобус " + "\n" +
                "назва автобуса : " + getName() + "\n" +
                "назва першої зупинки : " + getBeginningOfRouteName() + "\n" +
                "назва останньої зупинки : " + getEndOfRouteName() + "\n" +
                "швидкість в даний момент : " + getSpeed() + "\n" +
                "вага автобуса : " + getMass() + "\n" +
                "кількість пасажирів : " + getNumberOfPassengers() + "\n" +
                "кількість коліс : " + getNumberOfWheels() + "\n" +
                "перевірка на відправку : " + "\n" + "----------------------------------" + "\n" +
                checkPassengers(getNumberOfPassengers());
    }
}
