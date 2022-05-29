/**
 * Author: Emirhan Bekmez
 * Date: 06.05.2022
 * Version: 0.1
 **/


public class Primzahlen {
    public static void main(String[] args) {
        int laenge = 101;                               // Der Wert in dem Array
        boolean[] arr = new boolean[laenge];            //Erstellen eines Arrays mit dem datentyp boolean

        for(int i = 0; i < arr.length; i++){            // schleife zum durch iterieren des Arrays
            arr[i] = istPrimzahl(i);                    // name des array in dem index i = Methodenaufruf
            System.out.println(i + " ist " + arr[i]);   // Konsolen ausgabe
        }
    }

    /** Methode zum überprüfung des Primzahlen **/
    public static boolean istPrimzahl(int n){
        if(n <= 1)
            return false;
        for (int i = 2; i<= Math.sqrt(n); i++)
            if(n % i == 0)
                return  false;
        return true;
    }
}
