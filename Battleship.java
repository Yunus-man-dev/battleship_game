import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

// import battleship_game.Map;
// import battleship_game.Ship;

public class Battleship {
    
    public static void main(String[]Args){


        
        Ship ship = new Ship("Cruiser");


        // String maker = "A1";
        // if(!maker.equals(maker))
        // System.out.println();

        ArrayList<String> ha = ship.findSquares("A1","A5","horizontal");

        System.out.println(ha.get(2).length());


    }


}
