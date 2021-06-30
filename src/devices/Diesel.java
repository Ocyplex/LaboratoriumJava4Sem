package devices;

public class Diesel extends Car{
    public Diesel(String producer, String model) {
        super(producer, model);
    }

    @Override
    public void refuel() {
        super.refuel();
        System.out.println("Zatankowales dieslem " +this.producer +" "+this.model);
    }
}
