package devices;

import com.company.Human;

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

    @Override
    public void sell(Human humanSeller, Human humanBuyer, double price) {
        if(humanSeller.phone==null)
        {
            System.out.println(humanSeller.name + " nieposiada komorki");
            return;
        }
        if (humanSeller.phone.hashCode() == Phone.this.hashCode() ) {//Sprawdzenie czy wlasciciel posiada to komorke


            if (humanBuyer.cash > price)//Zakup Przelew + Zapisanie zwierzecia
            {
                humanBuyer.phone = humanSeller.phone;
                humanSeller.phone = null;
                humanBuyer.cash = humanBuyer.cash - price;
                humanSeller.cash = humanSeller.cash + price;
                System.out.println(humanSeller.name + " sprzedaje " + this.producer +" "+ this.model + " do " + humanBuyer.name + " za "  + price);
                System.out.println(humanSeller.name +"nowy Stankonta:" +humanSeller.cash);
                System.out.println(humanBuyer.name +" nowy Stankonta:" +humanBuyer.cash);
            }else {
                System.out.println(humanBuyer.name + " nie posiada wystarczajaco pieniedzy!");
            }
        } else {
            System.out.println(humanSeller.name + "nieposiada tej komorki!");
        }
    }

}
