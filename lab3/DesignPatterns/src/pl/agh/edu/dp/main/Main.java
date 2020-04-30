package pl.agh.edu.dp.main;

import pl.agh.edu.dp.labirynth.BombedMazeFactory;
import pl.agh.edu.dp.labirynth.EnchantedMazeFactory;
import pl.agh.edu.dp.labirynth.MazeFactory;

public class Main {
    public static void main(String[] args) {

        MazeFactory mazeFactory = EnchantedMazeFactory.getInstance();
        System.out.println(mazeFactory.equals(EnchantedMazeFactory.getInstance()));
        MazeFactory mazeFactory1 = BombedMazeFactory.getInstance();
        System.out.println(mazeFactory1.equals(BombedMazeFactory.getInstance()));
        System.out.println(mazeFactory.equals(mazeFactory1));
    }
}



