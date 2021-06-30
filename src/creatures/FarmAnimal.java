package creatures;

import com.company.Human;

public class FarmAnimal extends Animal implements EdBile {


    public FarmAnimal(String species, String name) {
        super(species, name);
    }

    public void beEaten()
    {
        System.out.println(this.name+" zostal zjedzony!");

    }

    @Override
    public void sell(Human humanSeller, Human humanBuyer, double price) {

    }
}
