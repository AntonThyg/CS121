package PokemonProject2;

import PokemonProject.Move;
import PokemonProject.Pokemon;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BattleManager {
    static Scanner ask = new Scanner(System.in);
    static HashMap<String, Pokemon> pokemonHashMap = new HashMap<>();
    static HashMap<String, Move> moveHashMap = new HashMap<>();
    static ArrayList<Move> moveArrayList = new ArrayList<>();

    static {
        try {
            Scanner input = new Scanner(new File("src/PokemonProject/Pokemon.csv"));
            while (input.hasNextLine()) {
                String[] temp = input.nextLine().split(",");
                Pokemon tempP = new Pokemon(Integer.parseInt(temp[0]), temp[1], temp[2], temp[3], Integer.parseInt(temp[4]), Integer.parseInt(temp[5]), Integer.parseInt(temp[6]), Integer.parseInt(temp[7]), Integer.parseInt(temp[8]), Integer.parseInt(temp[9]), Integer.parseInt(temp[10]));
                pokemonHashMap.put(temp[1], tempP);
            }
            input.close();
        } catch (Exception e) {
            System.out.println("Error reading or parsing Pokemon.csv");
        }
        HashMap<Integer, String> type = new HashMap<>();
        HashMap<Integer, String> moveNames = new HashMap<>();
        try {
            Scanner types = new Scanner(new File("sec/PokemonProject/Types.csv"));
            while (types.hasNextLine()) {
                String[] temp = types.nextLine().split(",");
                type.put(Integer.parseInt(temp[0]), temp[1]);
            }
            types.close();
        } catch (Exception e) {
            System.out.println("Error reading or parsing Types.csv");
        }
        try {
            Scanner names = new Scanner(new File("src/PokemonProject/MoveNames.csv"));
            while (names.hasNextLine()) {
                String[] temp = names.nextLine().split(",");
                if (temp[1].equals("9")) {
                    System.out.println(temp[2]);
                    moveNames.put(Integer.parseInt(temp[0]), temp[2]);
                }
            }
            names.close();
        } catch (Exception e) {
            System.out.println("Error reading or parsing MoveNames.csv");
        }
        try {
            Scanner moves = new Scanner(new File("src/PokemonProject/Moves.csv"));
            //id,identifier,generation_id,type_id,power,pp,accuracy,priority,target_id,damage_class_id,effect_id,effect_chance,contest_type_id,contest_effect_id,super_contest_effect_id
            while (moves.hasNextLine()) {
                String[] temp = moves.nextLine().split(",");
                for(int i=0;i<temp.length;i++){
                    if(temp[i].equals("")){
                        temp[i]="0";
                    }
                }
                Move move = new Move(Integer.parseInt(temp[4]), moveNames.get(Integer.parseInt(temp[0])), type.get(Integer.parseInt(temp[3])));
                moveHashMap.put(move.getName(), move);
            }
            moves.close();
        } catch (Exception e) {
            System.out.println("Error reading or parsing Moves.csv");
        }

    }

    public static void main(String[] args) {
        int total;
        int[] scores = {0, 0};
        Scanner ask = new Scanner(System.in);
        System.out.println("Rounds?: ");
        total = ask.nextInt();
        System.out.println("Welcome to pokemon battler.");
        for (int i = 0; i < total; i++) {
            System.out.println("Player 1, pick your pokemon!");
            Pokemon p1 = pickPoke();
            p1.setMove(pickMove(p1, 1));

            System.out.println("Player 2, pick your pokemon!");
            Pokemon p2 = pickPoke();
            p2.setMove(pickMove(p2, 2));

            int winner = battle(p1, p2);
            scores[winner]++;
        }
        System.out.printf("\nPlayer 1:%d, Player 2:%d, Rounds:%d", scores[0], scores[1], total);
    }

    public static Pokemon pickPoke() {
        System.out.println("Enter a pokemon name (Capitalised)");
        while (true) {
            String name = ask.next();
            if (pokemonHashMap.containsKey(name)) {
                return pokemonHashMap.get(name);
            } else {
                System.out.println("Pokemon not found, try again.");
            }
        }
    }

    public static Move pickMove(Pokemon p, int player) {
        Scanner ask = new Scanner(System.in);
        System.out.println("Player " + player + " enter move: ");
        while (true) {
            String input = ask.next();
            if (moveHashMap.containsKey(input)) {
                Move move = moveHashMap.get(input);
                return move;
            } else {
                System.out.println("Move does not exist, enter something else");
            }
        }
    }

    public static int battle(Pokemon p1, Pokemon p2) {
        while (true) {
            if (p1.getSpeed() > p2.getSpeed()) {
                p2.attacked(p1);
                if (p2.getHp() > 0) {
                    p1.attacked(p2);
                }
            } else if (p1.getSpeed() < p2.getSpeed()) {
                p1.attacked(p2);
                if (p1.getHp() > 0) {
                    p2.attacked(p1);
                }
            } else {
                int decider = (int) (Math.random() * 100);
                if (decider <= 50) {
                    p2.attacked(p1);
                    if (p2.getHp() > 0)
                        p1.attacked(p2);
                } else {
                    p1.attacked(p2);
                    if (p1.getHp() > 0)
                        p2.attacked(p1);
                }
            }
            if (hasVictor(p1, p2)) {
                Pokemon victor = victor(p1, p2);
                System.out.printf("\n%s has won", victor.getName());
                if (victor.equals(p1)) {
                    return 0;
                } else if (victor.equals(p2)) {
                    return 1;
                }
            }
        }
    }

    public static boolean hasVictor(Pokemon p1, Pokemon p2) {
        if (p1.getHp() > 0 && p2.getHp() <= 0) {
            return true;
        } else return p1.getHp() <= 0 && p2.getHp() > 0;
    }

    public static Pokemon victor(Pokemon p1, Pokemon p2) {
        if (p2.getHp() <= 0) {
            return p1;
        }
        return p2;
    }
}
