package devices;

import com.company.Human;

import java.util.ArrayList;
import java.util.List;

public class Phone extends Device
{
    public String producer;
    public String model;
    public String operationSystem;
    public Double screenSize;
    public String appName;
    public String appVersion;
    public  List<String> appList = new ArrayList<>();
    public  List<String> appToInstallList = new ArrayList<>();
    public String serverAdress;
    static final String finalServerAdress = null;

    public Phone(String producer, String model,String finalServerAdress){
        this.producer = producer;
        this.model = model;
 }



    @Override
    public void turnOn() {
        super.turnOn();
        this.mode = "Wlaczona komorka";
    }

    @Override
    public void sell(Human humanSeller, Human humanBuyer) {

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
    public void installAnnApp(String appName){
        this.appName = appName;
        System.out.println("Zainstalowales " + appName);
        appList.add(appName);
    }

    public void installAnnApp(String appName,String appVersion){
        this.appName = appName;
        this.appVersion = appVersion;
        System.out.println("Zainstalowales " + appName + " z wersja " + appVersion);
        appList.add(appName);
    }

    public void installAnnApp(String appName, String appVersion, String serverAdress){
        this.appName = appName;
        this.appVersion = appVersion;
        this.serverAdress = serverAdress;
        System.out.println("Zainstalowales " + appName + " z wersja " + appVersion + " z serwera "+ serverAdress);
        appList.add(appName);
    }

    public void installAnnApp(List appToInstallList){
        this.appList = appList;
        System.out.println("Zainstalowales liste applikacji");
    }


}
