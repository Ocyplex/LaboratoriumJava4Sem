package devices;

public class Electric extends Car{
    public Electric(String producer, String model) {
        super(producer, model);
    }

    @Override
    public void refuel() {
        super.refuel();
        System.out.println("Naladowales " +this.producer +" "+this.model);
    }
}
