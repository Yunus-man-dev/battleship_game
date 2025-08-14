// package battleship_game;

import java.util.ArrayList;
import java.util.Arrays;

public class Map {
    
   private  ArrayList<Ship> harbor = new ArrayList<>();


    //constructor
    public Map(ArrayList<Ship> harbor){

        this.harbor=harbor;
    }


    public void placeShip(){




    }






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
                    
                    coExist = " " + harbor.get(i).getCoordinates().get(j);

                }

                




            }



        }


        return coExist;


    }
    
}
