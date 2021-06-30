package devices;

import com.company.Human;

public class LPG extends Car{
    public LPG(String producer, String model,Double value,Integer productionYear) {
        super(producer, model,value, productionYear);
    }

    @Override
    public void refuel() {
        super.refuel();
        System.out.println("Zatankowales LPG " +this.producer +" "+this.model);
    }

    @Override
    public void sell(Human humanSeller, Human humanBuyer, double price) {

    }
}
