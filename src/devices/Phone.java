package devices;

public class Phone extends Device
{
    public String producer;
    public String model;
    public String operationSystem;
    public Double screenSize;

    public Phone(String producer, String model){
        this.producer = producer;
        this.model = model;
 }



    @Override
    public void turnOn() {
        super.turnOn();
        this.mode = "Wlaczona komorka";
    }
}
