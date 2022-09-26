package Q1.ACtivity_14;

public class Boat {
    String name;
    int year,mileage;
    boolean motorized;
    public Boat(){
        this.name="Boaty mcBoatface";
        this.year=2000;
        this.mileage=3;
        this.motorized=false;
    }
    public Boat(String name){
        this.name=name;
    }
    public Boat(String name, int year, int mileage, boolean motorized){
        this.name=name;
        this.mileage=mileage;
        this.motorized=motorized;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getMileage() {
        return mileage;
    }
    public int getMileage(int i) {
        return mileage+i;
    }

    public boolean isMotorized() {
        return motorized;
    }

    public void setMotorized(boolean motorized) {
        this.motorized = motorized;
    }
}
