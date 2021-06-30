package devices;

import com.company.Human;
import com.company.Sellable;

public abstract class Device implements Sellable {

    public String producer;
    public String mode;
    public Integer yearOfProduction;
    public Double value;

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

    public abstract void sell(Human humanSeller, Human humanBuyer);
}
