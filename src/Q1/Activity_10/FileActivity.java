package Q1.Activity_10;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileActivity {
    public static void main(String[] args) {
        fileAppend();
    }

    public static void fileRead() {
        try {
            Scanner input = new Scanner(new File("src/Chapter_1_to_2/Activity_10/Companies.txt"));
            while (input.hasNextLine()) {
                System.out.println(input.next());
            }
            input.close();
        } catch (Exception e) {
            System.out.println("Error reading or parsing Companies.txt");
        }
    }

    public static void fileWrite() {
        try {
            FileWriter writer = new FileWriter(new File("src/Chapter_1_to_2/Activity_10/Companies.txt"));
            writer.write(JOptionPane.showInputDialog(JOptionPane.getRootFrame(), "Company,Revenue(Billions),Year founded")+"\n");
            writer.close();
        } catch (Exception e) {
            System.out.println("Error reading or parsing Companies.txt");
        }
    }

    public static void fileAppend() {
        try {
            FileWriter writer = new FileWriter(new File("src/Chapter_1_to_2/Activity_10/Companies.txt"),true);
            writer.append(JOptionPane.showInputDialog(JOptionPane.getRootFrame(), "Company,Revenue(Billions),Year founded")+"\n");
            writer.close();
        } catch (Exception e) {
            System.out.println("Error reading or parsing Companies.txt");
        }
    }
}
