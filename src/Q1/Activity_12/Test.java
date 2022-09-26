package Q1.Activity_12;

public class Test {
    public static void main(String[] args) {
        Car hondaOdyssey = new Car("Honda","Odyssey",2007,239634,21,240,9.9);
        hondaOdyssey.toString();
        hondaOdyssey.setMake("Chrysler");
        hondaOdyssey.setModel("Town and Country");
        hondaOdyssey.setYear(2012);
        hondaOdyssey.setMileage(205236);
        hondaOdyssey.setMpg(12);
        hondaOdyssey.setHorsepower(185);
        hondaOdyssey.toString();

        Company nvidia = new Company("Nvidia Corporation",16,1993);
        nvidia.toString();
        nvidia.setName("Microsoft");
        nvidia.setRevenue(168);
        nvidia.setYrFounded(1975);
        nvidia.toString();
    }
}
