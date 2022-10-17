package Q2.Activity_22;

public class Dog {
    static int amount;
    int age;
    String name, breed;

    public Dog(int age, String name, String breed){
        this.age=age;
        this.name=name;
        this.breed=breed;
        amount++;
    }

    public int getAge() {
        return age;
    }
    public void birthday(){
        System.out.println("Happy birthday "+name);
        age++;
    }

    public static int getAmount() {
        return amount;
    }

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }
}
