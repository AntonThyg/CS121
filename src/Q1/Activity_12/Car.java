package Q1.Activity_12;

public class Car {
    String make,model;
    int year,mileage,mpg,hp;
    double z60;
    public Car(){
        this.make="Honda";
        this.model="Odyssey";
        this.year=2007;
        this.mileage=239112;
        this.mpg=21;
        this.hp=240;
        this.z60=9.9;
    }
    public Car(String make, String model, int year, int mileage, int mpg, int hp, double z60){
        this.make=make;
        this.model=model;
        this.year=year;
        this.mileage=mileage;
        this.mpg=mpg;
        this.hp=hp;
        this.z60=z60;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getMpg() {
        return mpg;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }

    public int Horsepower() {
        return hp;
    }

    public void setHorsepower(int hp) {
        this.hp = hp;
    }

    public double ZeroTo60() {
        return z60;
    }

    public void set0to60(double z60) {
        this.z60 = z60;
    }

    @Override
    public String toString() {
        System.out.println("Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                ", mpg=" + mpg +
                ", hp=" + hp +
                ", 0-60=" + z60 +
                '}');
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                ", mpg=" + mpg +
                ", hp=" + hp +
                ", 0-60=" + z60 +
                '}';
    }
}
