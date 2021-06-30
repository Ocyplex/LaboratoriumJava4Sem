package devices;

import com.company.Human;

public abstract class Car extends Device
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
        this.producer = producer;
        this.model = model;
    }

    @Override
    public void turnOn() {
        super.turnOn();
        this.mode = "Odpalony samochod";
    }

    @Override
    public void sell(Human humanSeller, Human humanBuyer, double price) {
        if(humanSeller.getCar()==null)
        {
            System.out.println(humanSeller.name + " nieposiada samochodu");
            return;
        }
        if (humanSeller.getCar().hashCode() == Car.this.hashCode()) {//Sprawdzenie czy wlasciciel posiada ten samochod


            if (humanBuyer.cash > price)//Zakup Przelew + Zapisanie zwierzecia
            {
                humanBuyer.setsCar(Car.this);
                humanSeller.setsCar(null);
                humanBuyer.cash = humanBuyer.cash - price;
                humanSeller.cash = humanSeller.cash + price;
                System.out.println(humanSeller.name + " sprzedaje " + Car.this.producer + " " + Car.this.model + " do " + humanBuyer.name + " za "  + price);
                System.out.println(humanSeller.name +"nowy Stankonta:" +humanSeller.cash);
                System.out.println(humanBuyer.name +" nowy Stankonta:" +humanBuyer.cash);
            }else {
                System.out.println(humanBuyer.name + " nie posiada wystarczajaco pieniedzy!");
            }
        } else {
            System.out.println(humanSeller.name + "nieposiada tego samochodu!");
        }
    }
    public void refuel(){

    }
}
