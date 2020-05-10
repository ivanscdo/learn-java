import bike.superclass.Bicycle;
import bike.subclass.mountain.MountainBike;
import bike.subclass.acme.ACMEBicycle;

class BicycleDemo {
    public static void main (String[] args) {

        // Bicycle bike1 = new Bicycle();
        // Bicycle bike2 = new Bicycle();

        // MountainBike bike3 = new MountainBike();
        
        ACMEBicycle bike4 = new ACMEBicycle();

        // bike1.changeCadence(50);
        // bike1.speedUp(10);
        // bike1.changeGear(2);
        // bike1.printStates();

        // bike2.changeCadence(50);
        // bike2.speedUp(10);
        // bike2.changeGear(2);
        // bike2.changeCadence(40);
        // bike2.speedUp(10);
        // bike2.changeGear(3);
        // bike2.printStates();

        // bike3.changeCadence(10);
        // bike3.speedUp(3);
        // bike3.changeGear(3);
        // bike3.changeCadence(20);
        // bike3.speedUp(6);
        // bike3.changeGear(6);
        // bike3.changeDampers(3);
        // bike3.printStates();       

        bike4.changeCadence(10);
        bike4.speedUp(3);
        bike4.changeGear(3);
        bike4.printStates();

    }
    
}
