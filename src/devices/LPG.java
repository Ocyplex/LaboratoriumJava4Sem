package devices;

public class LPG extends Car{
    public LPG(String producer, String model) {
        super(producer, model);
    }

    @Override
    public void refuel() {
        super.refuel();
        System.out.println("Zatankowales LPG " +this.producer +" "+this.model);
    }
}
