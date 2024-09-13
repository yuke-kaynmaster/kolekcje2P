import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        System.out.println("Hello world!");
        //tablica
        /*
        tablica musi mieć zdefiniowany rozmiar,
        którego potem nie można zmienić
        tablica przechowuje typy proste i złożone
         */
        int [] tablicaLiczbLosowych = new int[6];
        //losujemy z zakresu 1 do 100
        for (int i = 0; i < tablicaLiczbLosowych.length ; i++) {
            tablicaLiczbLosowych[i] = (int)(Math.random()*100);
        }
        //wypisywanie tablicy na ekranie
        for (int element:tablicaLiczbLosowych) {
            System.out.print(element+", ");
        }
        System.out.println(tablicaLiczbLosowych);
        //wypelnianie kolekcji wartościami losowym
        /*
        Kolekcja może przechowywać tylko typy zlozone
        np. Integer
        Kolekcja nie musi miec zdefiniowanego rozmiaru
        rozmiar może się zmieniac w trakcie
        List -> ArrayList, LinkedList,
        Set ->HashSet
        Map

         */

        ArrayList<Integer> listaLiczbLosowych = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int liczba =(int)(Math.random()*100+1);
            listaLiczbLosowych.add(liczba);
        }
        System.out.println("Wylosowana lista");
        for (Integer element:listaLiczbLosowych) {
            System.out.print(element+", ");
        }
        System.out.println(listaLiczbLosowych);
        //losowanie do listy bez powtorzen
        ArrayList <Integer> listaLosowychBezPowtorzen = new ArrayList<>();
        int liczba;
        for (int i = 0; i < 6; i++) {
            liczba = (int)(Math.random()*100+1);
            while (listaLosowychBezPowtorzen.contains(liczba)){
                liczba = (int)(Math.random()*100+1);
            }
            listaLosowychBezPowtorzen.add(liczba);
        }
        System.out.println(listaLosowychBezPowtorzen);
        /*
        lista:
        indeksowana, uporządkowana, elementy mogą się powtarzać
        zbiór: (zazwyczaj)
        nieindeksowany, nieuporzadkowane, elementy unikatowe
         */
        HashSet <Integer> zbiorLiczbLosowych = new HashSet<>();
        while (zbiorLiczbLosowych.size()<6){
            liczba = (int)(Math.random()*100+1);
            zbiorLiczbLosowych.add(liczba);
        }
        System.out.println("Zbiór liczb losowych");
        System.out.println(zbiorLiczbLosowych);
    }
}