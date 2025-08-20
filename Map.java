// package battleship_game;

import java.util.ArrayList;
import java.util.Arrays;

public class Map {
    
   private  ArrayList<Ship> harbor = new ArrayList<>();


    //constructor
    public Map(ArrayList<Ship> harbor){

        this.harbor=harbor;
    }


    // public void placeShip(){




    // }








    //isInBoundary() ===> checks if the position in the 10 x 10 place.


    public String isLegalPlacement(ArrayList<String> coordinates){ 

        //harbordaki gemiyi al. 
        // geminin koordinatlari ile verilen arraylisti karsilastir.
        // ayni denk gelen koordinat olursa breakle ve o kooridnati don
        //yoksa bos stringi don

        String coExist = "";


        // harbor.stream().map( s -> {System.out.println(s.getName());}
        // );
        for(int i = 0; i< harbor.size(); i++){

            for(int j = 0; j<harbor.get(i).getCoordinates().size(); j++){
                // harbordaki i 'nci geminin koordinatlari uzunlugunda olana kadar j yi arttir

                if(coordinates.contains(harbor.get(i).getCoordinates().get(j))){
                    
                    coExist += " " + harbor.get(i).getCoordinates().get(j);

                }

                




            }



        }


        return coExist;


    }





      public void placeShip(ArrayList<String> coordinates, String name){
        String conflictedPositions = isLegalPlacement(coordinates);
        if(conflictedPositions.length() == 0 ){

            //find the ship whose name is given and set its coordinates to given 
            for(int i = 0; i<harbor.size(); i++){
                if(harbor.get(i).getName().equals(name)){

                    harbor.get(i).setCoordinates(coordinates);
                    System.out.println("Ship is sealed! Good job captain :)");
                    showMap();
                }
            }
        }
            

        else 
        System.out.println("Could not place the ship. There are conflicts in these positions: "+ conflictedPositions);
    }



    public boolean isShipsSealed (){

        boolean IsShipsSealed = true;


        // harbordaki gemiyi al
        for(Ship s : harbor){

            //coordinat arraylistinin uzunluguna bak, 0 ise false don
            if(s.getCoordinates().size() == 0){

                IsShipsSealed = false;
            }


        }
        //looptan sonra degismedi ise true
        return IsShipsSealed;

    }
    

    public void showMap(){

        //konumu olustur
        //harbordaki her bir geminin koordinatinda var mi diye bak
        //Varsa {$} , yoksa { }
        //
       
        System.out.println("    1    2    3    4    5    6    7    8    9    10");
        System.out.println();
        for(int i = 1; i<11; i++){
            //row
            char helper = (char) (64+i);

            String row =helper + "";

                for(int j = 1; j<11; j++){
                     boolean isFound = false;
                    String current = helper+""+j+"";

                    for(int k =0; k<harbor.size(); k++){

                        if(harbor.get(k).getCoordinates().contains(current)){
                            row+= "  {$}";
                            isFound = true;
                        }
                        
                    }
                    if(!isFound)
                    row+= "  { }";

                    if(j == 10){
                         System.out.println(row);
                         System.out.println();
                    }
                   
                }

        }










    }


















}
