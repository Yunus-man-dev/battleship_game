package battleship_game;

public class Ship {
    private int length;
    private String startRow;
    private String finishRow;
    private int startColum;
    private int finishColum;

    //constructor
    public Ship(int length,String startRow,String finishRow, int startColum, int finishColum){
        this.length=length;
        this.startRow=startRow;
        this.finishRow=finishRow;
        this.startColum= startColum;
        this.finishColum=finishColum;
    }
    //getters 
    public int getLength(){
        return this.length;
    }
    public String getStartRow(){
        return startRow;
    }
    public String getFinishRow(){
        return finishRow;
    }
    public int getStartColum(){
        return startColum;
    }
    public int getFinishColum(){
        return finishColum;
    }

    //setters


    /*    functions

    - showMap ==> shows the map and ships locations. The blocks that is shot and there is a ship should be marked as O and blocks 
    that is shot but there are not any ships should be marked as X. One of them should show your own map and the other one should
    not show the enemy ships

    - isShot ==> return true if that spot is shot 
    - isHit ==> return true if there is a ship in the shot location

    

    */
    public void showMap(){

        System.out.println("    1 2 3 4 5 6 7 8 9 10");
        String show="";
        for(int i =0; i<10; i++){
            char ch = (char) (65+i);
            show= ch+"  ";
            for(int j=0; j<10; j++){



            }
        }


    }

    // public boolean isShot(){

    // }
    



}
