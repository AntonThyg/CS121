package Q1.Activity_13;

public class TestClass {
    public static void main(String[] args) {
        House casa = new House("123 W Four St",5,6,20,10,2150000);
        System.out.println(casa.toString());
        System.out.println(casa.getPrice());
        System.out.println(casa.getRooms());
        //System.out.println(casa.getBath());
    }
}
