package Q1.ACtivity_14;

public class TestClass {
    public static void main(String[] args) {
        Boat boat = new Boat();
        Boat ship = new Boat("Shippy mcShipface");
        Boat carrier = new Boat("Carriery mcAircraftcarrierface",1930,200000,true);
        System.out.printf("Mileage: %s, Current: %s",carrier.getMileage(),carrier.getMileage(2311));
    }
}
