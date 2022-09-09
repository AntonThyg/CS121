package PokemonProject;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class BattleManager {
    static ArrayList<Pokemon> pokemon = new ArrayList();
    static ArrayList<String> pokemonIndex = new ArrayList();
    static {
        try {
            Scanner input = new Scanner(new File("src/PokemonProject/Pokemon.csv"));
            while (input.hasNextLine()) {
                String[] temp = input.nextLine().split(",");
                pokemon.add(new Pokemon(Integer.parseInt(temp[0]), temp[1], temp[2], temp[3], Integer.parseInt(temp[4]), Integer.parseInt(temp[5]), Integer.parseInt(temp[6]),Integer.parseInt(temp[7]),Integer.parseInt(temp[8]),Integer.parseInt(temp[9]),Integer.parseInt(temp[10])));
                pokemonIndex.add(temp[1]);
            }
            input.close();
        } catch (Exception e) {
            System.out.println("Error reading or parsing cleanSentiment.csv");
        }
    }
    public static void main(String[] args) {
        
    }
    public static void battle(Pokemon p1, Pokemon p2){
        do{
            if(p1.getSpeed()>p2.getSpeed()){
                p2.attacked(p1);
                if(!hasVictor(p1,p2)){
                    p1.attacked(p2);
                }
            }else if(p1.getSpeed()<p2.getSpeed()){
                p1.attacked(p2);
                if(!hasVictor(p1,p2)){
                    p2.attacked(p1);
                }
            }else{

            }
        }while (!hasVictor(p1,p2));
    }
    public static boolean hasVictor(Pokemon p1, Pokemon p2){
        if(p1.getHp()>0&&p2.getHp()<=0){
            System.out.println();
            return true;
        }
    }
}
