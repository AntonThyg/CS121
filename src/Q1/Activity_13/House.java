package Q1.Activity_13;

public class House {
    public String address;
    public int stories;
    private int bath,bed,rooms,price;
    House(String address, int stories, int bath, int bed, int rooms, int price){
        this.address=address;
        this.stories=stories;
        this.bath=bath;
        this.bed=bed;
        this.rooms=rooms;
        this.price=price;
    }

    @Override
    public String toString() {
        return "House{" +
                "address='" + address + '\'' +
                ", stories=" + stories +
                ", bath=" + bath +
                ", bed=" + bed +
                ", rooms=" + rooms +
                ", price=" + price +
                '}';
    }
    protected int getPrice(){
        return price;
    }
    private int getBath(){
        return bath;
    }
    int getRooms(){
        return rooms;
    }

}
