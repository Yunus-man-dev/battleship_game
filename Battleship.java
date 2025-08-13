import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

// import battleship_game.Map;
// import battleship_game.Ship;

public class Battleship {
    
    public static void main(String[]Args){


        



        Ship cruiser = new Ship(3, "A", "A", 1, 3, "right");
        Ship  carrier = new Ship(5, "B"," B", 1, 5, "right");
        Ship  battleship = new Ship(4, "E", "H", 5, 5, "down");
        Ship  submarine = new Ship(3, "E", "H", 2, 2, "up");

        ArrayList<Ship> arr=new ArrayList<>();
        arr.add(submarine);
        arr.add(carrier);
        arr.add(cruiser);
        arr.add(battleship);
        // Ship arr[]=new Ship[4];
        // arr[0]=cruiser;
        // arr[1]=carrier;
        // arr[2]=battleship;
        // arr[3]=submarine;
        Map player1= new Map("player1", arr);

        player1.fillShipsLocations();
        System.out.println(Arrays.toString(player1.getShipsLocations()));

        // Scanner in = new Scanner(System.in);
        
        // //Explanation and location question
        // System.out.println("—Welcome to YES Gaming Battleship :)");
        // System.out.printf("--In this game your mission is to guess the enemy ships locations and  shoot them. If you able to guess a ship's every part, it will sink.%n--Your main goal is to sink every enemy's ship.%n--Before guns start to talk, let's decide your ships locations%n--You can position them by yourself or can take the random replacement.Which option would you want to choose?\n" + //
        //                 "");
        // System.out.print("A: Manual replacment                 B: Random replacment");

        // String choice = in.next();
        // if(choice.equalsIgnoreCase("A")){
         

       


        // }
        // else{





        // }
        //Location choice




    }


}
