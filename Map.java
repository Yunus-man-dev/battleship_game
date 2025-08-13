// package battleship_game;

import java.util.ArrayList;
import java.util.Arrays;

public class Map {
    
    private String name;
    private ArrayList<Ship> ships;
    private String[] shipsLocations = new String[15];
    //constructor
    public Map(String name, ArrayList<Ship> ships){
        this.name=name;
        this.ships = new ArrayList<>(ships);
    }
    //getters
    public String getName() {
        return name;
    }

    public ArrayList<Ship> getShips() {
        return ships;
    }

    public String[]getShipsLocations(){
        return shipsLocations;
    }
    //setter

    public void addShips(Ship ship){
        ships.add(ship);
    }
    
    



     /*    functions

    - showMap ==> shows the map and ships locations. The blocks that is shot and there is a ship should be marked as O and blocks 
    that is shot but there are not any ships should be marked as X. One of them should show your own map and the other one should
    not show the enemy ships

    - isShot ==> return

    vurulma mekanigi
    Kullanici bir koordinat verecek veya ben otomatik olarak bir tane olusturacagim.
    O koordinatta bir geminin olup olmadigina karar vermek
    Yoksa o yer X olarak hafizaya alinmasi ve mapte gosterulmesu lazim
    Varsa o yer O olarak hafizaya alinmasi ve nmapte gosterulmesi lazim. Ardindan kisi veya makine bir kez daha koordinat istiyecek
    */


        public void fillShipsLocations(){
            String holder="";
            boolean check= true;
            String demo[]= new String[15];
            int helper=0;
            for(int i =0; i< ships.size(); i++){
            

                
                    
                    if(ships.get(i).getDirection().equalsIgnoreCase("up")){
                     int b = (int)ships.get(i).getStartRow().charAt(0);
                        for(int j =0; j<ships.get(i).getLength(); j++){
                            holder= ""+ (b-j) + ships.get(i).getStartColum();
                            for (int h =0; j<15; j++){
                                if(holder.equals(demo[j])){
                                    check=false;
                                    break;

                                }
                               
                            }
                            if(check){
                                demo[helper]=holder;
                                helper++;
                            }

                        }

                    }

                    else if(ships.get(i).getDirection().equalsIgnoreCase("down")){
                       int b = (int)ships.get(i).getStartRow().charAt(0);
                        for(int j =0; j<ships.get(i).getLength(); j++){
                            holder= ""+ (b+j) + ships.get(i).getStartColum();
                            for (int h =0; j<15; j++){
                                if(holder.equals(demo[j])){
                                    check=false;
                                    break;

                                }
                               
                            }
                            if(check){
                                demo[helper]=holder;
                                helper++;
                            }

                        }





                    }

                    else if(ships.get(i).getDirection().equalsIgnoreCase("right")){
                        for(int h=0; h<ships.get(i).getLength(); h++){

                            holder = ships.get(i).getStartRow()+ (ships.get(i).getStartColum()+h);
                            for (int j =0; j<15; j++){
                                if(holder.equals(demo[j])){
                                    check=false;
                                    break;
                                }
                                
                            }
                            if(check){
                                demo[helper]=holder;
                                helper++;
                            }
                            


                        }
                        
                   
                    

                    }

                    else{
                        for(int h=0; h<ships.get(i).getLength(); h++){

                            holder = ships.get(i).getStartRow()+ (ships.get(i).getStartColum()-h);
                            for (int j =0; j<15; j++){
                                if(holder.equals(demo[j])){
                                    check=false;
                                    break;

                                }
                               
                            }
                            if(check){
                                demo[helper]=holder;
                                helper++;
                            }
                            


                        }




                    }


                
               
                



            }

            if(check){
                this.shipsLocations = Arrays.copyOf(demo,15);
            }
            else 
            System.out.println("Error! Some of the ships are conflicting");

        }
}
