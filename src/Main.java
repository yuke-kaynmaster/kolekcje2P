import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Gra gra1 = new Gra();
        gra1.zagraj();
        System.out.println("pierwsze "+sitoErastotenesa(100));

    }

    //do kartkowki
    //Wygeneruj tablicę liczb pierwszych mniejszych od 1000. Wykorzystaj do tego sito Eratostenesa.
    //Wypisz wszystkie liczby pierwsze z zakresu od x do y, gdzie x0 i x,y <1000.

    static ArrayList<Integer> sitoErastotenesa(int liczba){
        //przygotowanie listy z wartosciami logicznymi
        ArrayList<Boolean> logiczne = new ArrayList<>();
        logiczne.add(false);
        logiczne.add(false);
        for (int i = 2; i < liczba; i++) {
            logiczne.add(true);
        }
        //wykreslanie wielokrotnosci liczb pierwszych
        for (int i = 0; i < liczba; i++) {
            if (logiczne.get(i).equals(true)){
                //wykreaslanie zmiana na false
                for (int k = i*2 ; k < liczba ; k = k + i){
                    logiczne.set(k,false);
                }
            }
        }
        ArrayList<Integer> pierwsze = new ArrayList<>();
        for (int i = 0; i < logiczne.size(); i++) {
            if (logiczne.get(i).equals(true)){
                pierwsze.add(i);
            }

        }
        return pierwsze;
    }
}