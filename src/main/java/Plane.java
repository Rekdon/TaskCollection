/**
 * Created by Rekdon on 24.04.2017.
 */
public class Plane extends Mashine {
    private int mass;
    private int numberOfPassengers;
    private int numberOfWheels;
    private int numberOfPilots;


    public Plane(String name, int speedNow) {
        super(name, speedNow);
    }

    public Plane(String name, int speedNow, int mass, int numberOfPassengers, int numberOfWheels, int numberOfPilots) {
        super(name, speedNow);
        this.mass = mass;
        this.numberOfPassengers = numberOfPassengers;
        this.numberOfWheels = numberOfWheels;
        this.numberOfPilots = numberOfPilots;
    }


    @Override
    public int getMass() {
        return mass;
    }

    @Override
    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    @Override
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public int getNumberOfPilots() {
        return numberOfPilots;
    }

    public String checkPassengers(int numberOfPassengers,int numberOfPilots)
    {
        if(numberOfPassengers+numberOfPilots>MAX_NUMBER_OF_PASSENGERS_IN_PLANE)
        {
           return "Кількість людей на літаку перевищує норму,політ відкладено";
        }
        else
        {
           return "Кількість людей на літаку не перевищує норму,літак готовий до польоту";
        }
    }

    @Override
    public String toString() {
        return  "          Інформація про літак         "+"\n"+
                "Назва літака : " + getName()+"\n" +
                "швидкість в даний момент : " + getSpeed() +"\n"+
                "загальна вага літака : " + getMass() + "\n"+
                "кількість пасажирів : " + getNumberOfPassengers() +"\n"+
                "кількість коліс : " + getNumberOfWheels() +"\n"+
                "кількість пілотів :" + getNumberOfPilots() +"\n"+
                checkPassengers(getNumberOfPassengers(),getNumberOfPilots());

    }
}
