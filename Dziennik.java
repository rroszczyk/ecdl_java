/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package net.roszczyk.dziennik;

/**
 *
 * @author roszczyr
 */
public class Dziennik {

    private final int maxymalnaLiczbaOcen;
    private final int maxymalnaLiczbaUczniow;
    private final String[] przedmioty;
    private final int[][][] oceny;
    
    public Dziennik(int liczbaUczniow, int liczbaOcen) { // konstruktor wywoływany tylko raz
        System.out.println("Inicjalizacja naszego dziennika szkolnego");
        przedmioty = new String[5];
        przedmioty[0] = "matematyka";
        przedmioty[1] = "język polski";        
        przedmioty[2] = "język angielski";
        przedmioty[3] = "informatyka";
        przedmioty[4] = "biologia";        
        
        maxymalnaLiczbaOcen = liczbaOcen;
        maxymalnaLiczbaUczniow = liczbaUczniow;
        
        oceny = new int[przedmioty.length][liczbaUczniow][liczbaOcen];
        
        for (int p = 0; p < przedmioty.length; p++) {
            for (int u = 0; u < liczbaUczniow; u++) {
                for (int o = 0; o < liczbaOcen; o++) {
                    oceny[p][u][o] = 0;
                }
            }
        }
    }

    public void dodajOceneDlaUcznia(int numerPrzedmiotu, int numerUcznia, int ocena)
    {
        for (int i = 0; i < maxymalnaLiczbaOcen; i++) {
            if (oceny[numerPrzedmiotu - 1][numerUcznia - 1][i] == 0) {                
                oceny[numerPrzedmiotu - 1][numerUcznia - 1][i] = ocena;
                break;
            }
        }
    }
    
    public void wypiszOcenyZPrzedmiotu(int numerPrzedmiotu, float srednia) {
        //oceny[p][u][o] = 0;
        System.out.println("Oceny dla przedmiotu: " + przedmioty[numerPrzedmiotu - 1]);
        for (int u = 0; u < maxymalnaLiczbaUczniow; u++) {
            String s = "" + (u + 1) + ": ";
            float sredniaOcenaUcznia = 0;
            int liczbaOcenUcznia = 0;
            for (int o = 0; o < maxymalnaLiczbaOcen; o++) {
                int ocena = oceny[numerPrzedmiotu - 1][u][o];
                if (ocena > 0) {
                    if (o > 0) {
                        s += ",";
                    }
                    s += ocena;
                    sredniaOcenaUcznia += ocena;
                    liczbaOcenUcznia++;
                }
            }
            sredniaOcenaUcznia /= liczbaOcenUcznia;
            s += " -> " + sredniaOcenaUcznia;
            if (sredniaOcenaUcznia <= srednia) {
                System.out.println(s);
            }
        }
    }      
    
    public void wypiszOcenyZPrzedmiotu(int numerPrzedmiotu) {
        wypiszOcenyZPrzedmiotu(numerPrzedmiotu, 6);
    }
    
    public void wypiszSredniaOceneZPrzedmiotu() {
        System.out.println("Średnie oceny z przedmiotów");
        for (int indexPrzedmiotu = 0; indexPrzedmiotu < przedmioty.length; indexPrzedmiotu++) {
            System.out.print(przedmioty[indexPrzedmiotu] + ":");
            float sredniaOcena = 0;
            float liczbaOcen = 0;
            for (int u = 0; u < maxymalnaLiczbaUczniow; u++) {                        
                for (int o = 0; o < maxymalnaLiczbaOcen; o++) {                
                    int ocena = oceny[indexPrzedmiotu][u][o];
                    if (ocena > 0) {
                        sredniaOcena += ocena;
                        liczbaOcen++;
                    }
                }
            }
            sredniaOcena /= liczbaOcen;
            System.out.println("" + sredniaOcena);
        }
    }
    
    public static int getNumber(int min, int max) {
        return (int)((Math.random() * (max - min)) + min);
    }
    
    public static void main(String[] args) {
        int liczbaUczniow = 22;
        int liczbaOcen = 10;
        
        Dziennik dziennik = new Dziennik(liczbaUczniow, liczbaOcen); // tu się wywoła konstruktor
        
        for (int i = 0; i < 500; i++) {            
            dziennik.dodajOceneDlaUcznia(getNumber(1, 6), getNumber(1, liczbaUczniow+1), getNumber(1, 6));
        }
       
        dziennik.wypiszOcenyZPrzedmiotu(1);
        dziennik.wypiszOcenyZPrzedmiotu(3, 3);
        
        dziennik.wypiszSredniaOceneZPrzedmiotu();
    }
}
 