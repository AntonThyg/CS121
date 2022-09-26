package PokemonProject;

public class Move {
    int power;
    String name, type;
    public Move(int power, String name, String type){
        this.power=power;
        this.name=name;
        this.type =type;
    }

    public int getPower() {
        return this.power;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }
}
