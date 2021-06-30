package creatures;

import com.company.Human;

public class Pet extends Animal{
    public Pet(String species, String name) {
        super(species, name);
    }

    @Override
    public void sell(Human humanSeller, Human humanBuyer, double price) {

    }
}
