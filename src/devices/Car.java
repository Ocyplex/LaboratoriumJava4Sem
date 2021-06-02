package devices;

public class Car extends Device
{
    public String producer;
    public final String model;
    public Double value;

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", value=" + value +
                ", mode='" + mode + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    public Car(String producer, String model) {
        this.model = model;
    }

    @Override
    public void turnOn() {
        super.turnOn();
        this.mode = "Odpalony samochod";
    }
}
