package devices;

import com.company.Human;

public class Diesel extends Car{
    public Diesel(String producer, String model,Double value,Integer productionYear) {
        super(producer, model,value, productionYear);
    }

    @Override
    public void refuel() {
        super.refuel();
        System.out.println("Zatankowales dieslem " +this.producer +" "+this.model);
    }

    @Override
    public void sell(Human humanSeller, Human humanBuyer, double price) {

    }
}
