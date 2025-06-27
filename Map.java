package battleship_game;

import java.util.ArrayList;

public class Map {
    
    private String name;
    private ArrayList<Ship> ships;

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

}
