package devices;

import com.company.Human;

public abstract class Car extends Device
{
    public String producer;
    public final String model;


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

    public Car(String producer, String model, Double value,Integer productionYear) {
        this.producer = producer;
        this.model = model;
        this.value = value;
        this.yearOfProduction = productionYear;
    }

    @Override
    public void turnOn() {
        super.turnOn();
        this.mode = "Odpalony samochod";
    }

    @Override
    public void sell(Human humanSeller, Human humanBuyer) {
        int i = 0;
        for(;i<humanSeller.garage.length;i++){
            if(Car.this == humanSeller.garage[i])
            {
                System.out.println(humanSeller.name + " posiada samochod");
                break;
            }else if(i == humanSeller.garage.length)
            {
                System.out.println(humanSeller.name + " nieposiada samochodu");
                return;
            }
        }

            if (humanBuyer.cash > value)//Zakup Przelew + Zapisanie zwierzecia
            {
                humanBuyer.setCar(Car.this);
                humanSeller.setsCar(null);
                humanBuyer.cash = humanBuyer.cash - value;
                humanSeller.cash = humanSeller.cash + value;
                System.out.println(humanSeller.name + " sprzedaje " + Car.this.producer + " " + Car.this.model + " do " + humanBuyer.name + " za "  + value);
                System.out.println(humanSeller.name +"nowy Stankonta:" +humanSeller.cash);
                System.out.println(humanBuyer.name +" nowy Stankonta:" +humanBuyer.cash);
            }else {
                System.out.println(humanBuyer.name + " nie posiada wystarczajaco pieniedzy!");
            }
    }

    public void refuel(){

    }
}
