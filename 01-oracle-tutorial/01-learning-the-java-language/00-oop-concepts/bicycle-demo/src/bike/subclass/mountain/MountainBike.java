package bike.subclass.mountain;

import bike.superclass.Bicycle;

public class MountainBike extends Bicycle{

    int shockDampers = 0;

    public void changeDampers(int newValue) {
        shockDampers = shockDampers + newValue;
    };

    public void printStates() {
        super.printStates();
        System.out.println("shockDampers:" + shockDampers);
    }

}
