import java.util.ArrayList;

public class Ship {
   
    private String name;
    private ArrayList<String> coordinates = new ArrayList<>();


    //constructor
    public Ship(String name){
        this.name = name;
    }
    



    // GETTERS
    public String getName() {
        return name;
    }



    public ArrayList<String> getCoordinates() {
        return coordinates;
    }

    //SETTERS


    public void setCoordinates(ArrayList<String> coordinates){

        this.coordinates = coordinates;
    }



    public static ArrayList<String> findSquares(String start, String end, String direction){

        //A1 A5 rigth 
        char row = start.charAt(0);
        int colum = Integer.parseInt(start.substring(1));
        String  maker = "";
        //A1 A2 A3 A4 A5
        ArrayList<String> list = new ArrayList<>();

        if(direction.equalsIgnoreCase("horizontal")){
            //Only numbers will change
            int i = 0;
        while(!maker.equals(end)){
            maker = ""+ row + (colum+i) ;
            list.add(maker);
            i++;
        }
        }

        else{

        //only chars will be change
            int i = 0;
            while(!maker.equals(end)){
                maker = (char)((int)row + i) + colum+"";
                list.add(maker);
                i++;
            }




        }
        return list;


    }

    public static boolean isInBoundary(String start, String last){

        char row = start.charAt(0);
        int colum = Integer.parseInt(start.substring(1));
        
        if(row > 'J' || colum > 10){
            return false;
        }

        else 
        return true;

    }





    /* PREPARATION PHASE
    Oyuncu gemilerinin yerlerini sececek:
    Gemi, baslangic ve bitis konumlarini yazacak.   Ornek input = A2 A5 horizontal ya da horizontali bulucak bir metod yazilablir
    Baslangic ve bitis konumundan geminin uzanacagi yatay veya dikey sirayi bulucak ====> findSquares()
    Verilen baslangic, bitis ve gemi isimleri ile istenen araliga gemi eklencek ====> placeShip()
    Gemilerin ust uste gelmemesini ve harita disina cikmamalarini saglayacak ===> IsLegal()Placement


    Yerlestirme basarili ise 
    Her bir yerlestirmeden sonra tum gemilerin yerlesip yerlesmedigini kontrol edecek ==> IsShipsSealed()
    Yerlestirildi ise olusan haritayi gosterecek ==> showMap()
    Kalan gemilerin isimleirni gosterecek 

    Bunlar gemiler bitene kadar devam edecek

    Eger bir geminin yerini degistirmek istiyorsa ==> editShip() verilen gemiyi ve ona ait olan koordiantlari silicek

    Eger yerlestirme isi bitti ise ==> startGame()


    */


    /* GAME PHASE

    turun kimde oldugunu gosteren bir method ====> whoseTurn()

    Makine, sira kendisine geldiginde bilinen konumlardan rastgele bir tanesini sececek ve vurucak ====> attacByMachine()
    Bir atisin gemiyi vurup vurmadigini soyleyecek isShot( turnun kimde olduguna gore mape bakmasi lazim)
    Vurduysa tur karsiya gecmeyecek, bir kez daha vurucak.
    Vurulan konumlar bu listeden cikarilicak.

    oyuncu vurulabilcek konumdan birisni sececek ve vurucak
    Konum vurulabilir mi? daha once vurulmus mu veya haritanin sinirlari icerisinde mi ? ====> isLegal()
    isShot()
    Vurduysa tur karsiya gecmeyecek, bir kez daha vurucak.

    Her tur bitiminde harita gosterilicek. showMap()
    her bir tur bitiminde rakibin bir gemisinin kalip kalmadigini sorgulayacak ====> isGameOver()
 
    

    
     */


    






}
