import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

// import battleship_game.Map;
// import battleship_game.Ship;

public class Battleship {

    final static public String[] shipsNames = {"Cruiser","Battleship","Destroyer","Submarine"};

    // by the given start, end and ship name will be in district strings in an arraylist. first one would be the name, second start location, 
    //third one end location and fourth one the direction. While doing that, it will also checks if the ship name and locaitons are valid and in 
    // correct manner.
    private static String[] inputValidationAndSegmentation(String input){

        String[] list = new String[4];
        String[] arr = input.split(" ");
        list =  Arrays.copyOf(arr, 4);
        boolean row = false;
        boolean colum = false;

        //find direction based on the start and end
        // and make it fourth element

        // is the rows are same
        if(list[1].substring(0,1).equals(list[2].substring(0,1)))
        row = true;

        //is the digits are same
        if(list[1].substring(1).equals(list[2].substring(1)))
        colum = true;


        // rows same, ship is horizontal
        if(row && !colum)
        list[3] = "horizontal";

        //colums same, ship is vertical
        else if(!row && colum)
        list[3] = "vertical";

        else{
            //there is a problem , might be diagonal
            list[3] = null;
        }


        boolean nameValid = false;
        for(int i = 0; i<shipsNames.length; i++){
            //check for the name
            //if it is wrong, make the list[0] null. 

            if(list[0].equals(shipsNames[i])){
                nameValid = true;
                break;
            }
            
        }
       if(!nameValid)
       list[0] = null;


        
        //check for boundaries. if they are not in boundaries, make them null aswell
        if(!Ship.isInBoundary(list[1], list[2])){
            list[1] = null;
            list[2] = null;
        }

        return list;

    }










    
    public static void main(String[]Args){



        Scanner in = new Scanner(System.in);
        
        Ship cruiser = new Ship("Cruiser");
        Ship battleShip = new Ship("Battleship");
        Ship carrier = new Ship("Carrier");
        Ship submarine = new Ship("Submarine");


        ArrayList<Ship> harbor = new ArrayList<>();
        harbor.add(cruiser);
        harbor.add(battleShip);
        harbor.add(carrier);
        harbor.add(submarine);
        Map player1 = new Map(harbor);

        // String maker = "A1";
        // if(!maker.equals(maker))
        // System.out.println();

        // ArrayList<String> ha = ship.findSquares("A1","A5","horizontal");

        // System.out.println(ha.get(2).length());



      

        System.out.printf("%nWEEELLLCOMMEEE TO THE GAME OF BATTLESHIPPP XDDD"+
        "%nLETS SEE WHETHER YOU GOT THE GUTS FOR BEING THE LUCKY ONE WHO WILL BE ABLE TO SHOUT DOWN LEGENDARY CAPTAIN"
        +"%n BUT FIRST,  WRITE YOUR NAME SWABBIE: ");

        String name = in.nextLine();

        System.out.println("Hmmm,it does'nt look like you will manage to win with a name like that but ehhh, I will take my chances.");

        System.out.println("Before you guys start to attack each other like wild animals, you need to decide your ships locations.");

        player1.showMap();

        System.out.println("Here is the map. To place a ship, first write its name and then the start location and end location.Example: Cruiser A2 A5");
        System.out.print("Ships location: ");


        String input = in.nextLine();

        String[] arr = inputValidationAndSegmentation(input);
        boolean valid = false;

        while(!player1.isShipsSealed()){
        // is the given coordinates in the map? ==> kullanicidan almamiz lazim burayi

            //validaiton of the input
            while (!valid){
                //I use helper variable to being able to write mistakes indivudally, if there is no mistake, valid = true and we wont ask again for input
               int helper = 0;

               if(arr[0] == null){
                System.out.println("Invalid input.ErrorReason ==> Wrong pronunciation of ship ");
                helper++;
               }
               if(arr[1] == null){
                System.out.println("Invalid positions. Please enter coordinates IN the map!");
                helper++;

               }
               if(arr[3]==null){
                System.out.println("Invalid input. Do not write same spot and dont forget: Ships can only be placed horizontaly or vertically. Not diagonally ;))");
                helper++;
               }
               if(helper ==0){
                valid = true;
               }

               //if there is a problem, keep asking for input.
               if(!valid){

                // in.next();
                System.out.print("Please try again. The input should be like this: Ship-name first-location last-location");
                input = in.nextLine();
                arr = inputValidationAndSegmentation(input);
               }

            }
          
            //istenen konumlar
            // ship.findSquares(start,end,direction);

            // player1.placeShip( ship.findSquares(start,end,direction),"Cruiser");
            player1.placeShip(Ship.findSquares(arr[1],arr[2],arr[3]),arr[0]);
            // player1.showMap();

            //show remained ships




        }
            System.out.println("Succesfull, for now ....");
        
    }


}
