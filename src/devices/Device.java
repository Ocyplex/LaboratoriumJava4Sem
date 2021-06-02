package devices;

public abstract class Device {

    public String producer;
    public String mode;
    public Integer yearOfProduction;

    @Override
    public String toString() {
        return "Device{" +
                "producer='" + producer + '\'' +
                ", mode=" + mode +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    public void turnOn()
    {
        mode = "On";
    }
}
