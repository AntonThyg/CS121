package PokemonProject;

public class Pokemon {
    String name,type1,type2;
    int num,total,hp,atk,def,spAtk,spDef,speed;
    public Pokemon(int num,String name,String type1,String type2,int total,int hp,int atk, int def, int spAtk, int spDef, int speed){
        this.num=num;
        this.name=name;
        this.type1=type1;
        this.type2=type2;
        this.total=total;
        this.hp=hp;
        this.atk=atk;
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
    public int getAtk() {
        return atk;
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
        System.out.printf("\n%s has done %d damage to %s, %s is now at %d hp",p.getName(),);
        this.hp-=p.getAtk();
        if(this.hp<0){
            this.hp=0;
        }
    }
}
