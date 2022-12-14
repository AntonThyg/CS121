package PokemonProject2;

import PokemonProject.Move;

public class Pokemon {
    String name,type1,type2;
    int num;
    int total;
    int hp;
    int def;
    int spAtk;
    int spDef;
    int speed;
    PokemonProject.Move move;
    public Pokemon(int num, String name, String type1, String type2, int total, int hp, int atk, int def, int spAtk, int spDef, int speed){
        this.num=num;
        this.name=name;
        this.type1=type1;
        this.type2=type2;
        this.total=total;
        this.hp=hp;
        this.def=def;
        this.spAtk=spAtk;
        this.spDef=spDef;
        this.speed=speed;
    }
    public int getNum() {
        return num;
    }
    public String getName() {
        return name;
    }
    public String getType1() {
        return type1;
    }
    public String getType2() {
        return type2;
    }
    public int getTotal() {
        return total;
    }
    public int getHp() {
        return hp;
    }

    public int getDef() {
        return def;
    }
    public int getSpAtk() {
        return spAtk;
    }
    public int getSpDef() {
        return spDef;
    }
    public int getSpeed() {
        return speed;
    }
    public void attacked(Pokemon p){
        int dmg=p.getMove().power;
        //System.out.printf("\n%s has done %d damage to %s, %s is now at %d hp",p.getName(),dmg,this.name,this.name,this.hp);
        this.hp-=dmg;
        if(this.hp<0){
            this.hp=0;
        }
    }

    public void setMove(PokemonProject.Move move) {
        this.move = move;
    }
    public Move getMove() {
        return move;
    }

    public String getPokemonStats(){
        return String.format("[Name:%s,HP:%d,Move:%s,movePower:%d,Speed:%d",this.name,this.hp,this.getMove().getPower(),this.speed);
    }
}
