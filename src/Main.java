import java.lang.reflect.Array;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        ArrayList<Integer> wylosowane = wylosujLiczby(7);
        LinkedList<Integer> wpisane = wczytajLiczby(4);
        ArrayList<Integer> trafione = sprawdzKtorePowtarzajaSie(wylosowane,wpisane);
        System.out.println("liczby wylosowane");
        wypiszListe(wylosowane);
        System.out.println("liczby wpisane");
        wypiszListe(wpisane);
        System.out.println("liczby trafione");
        wypiszListe(trafione);

    }

    /**
     * wylosujLiczby - metoda, która losuje liczby całkowite z zakresu 1,100
     * @param ile - liczba wylosowanych wartości
     * @return lista z wylosowanymi
     */
    private static ArrayList<Integer> wylosujLiczby(int ile){
        ArrayList <Integer> listaLosowychBezPowtorzen = new ArrayList<>();
        int liczba;
        for (int i = 0; i < ile; i++) {
            liczba = (int)(Math.random()*100+1);
            while (listaLosowychBezPowtorzen.contains(liczba)){
                liczba = (int)(Math.random()*100+1);
            }
            listaLosowychBezPowtorzen.add(liczba);
        }
        return listaLosowychBezPowtorzen;
    }

    private static LinkedList<Integer> wczytajLiczby(int ile){
        LinkedList<Integer> wpisane = new LinkedList<>();
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj "+ile+" liczba");
        for (int i = 0; i < ile; i++) {
            wpisane.add(klawiatura.nextInt());
        }
        return wpisane;
    }

    private static void wypiszListe(List<Integer>lista){
        for (Integer element:lista){
            System.out.println(element+", ");
        }
    }

    private static ArrayList<Integer> sprawdzKtorePowtarzajaSie(ArrayList<Integer> wpisane,LinkedList<Integer> wylosowane){
        ArrayList<Integer> trafione = new ArrayList<>();
        for (Integer element:wylosowane){
            if(wpisane.contains(element)){
                trafione.add(element);
            }
        }
        return trafione;
    }
}