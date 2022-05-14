/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package net.roszczyk.ecdl;

import java.util.Scanner;

/**
 *
 * @author roszczyr
 */
public class Ecdl {

    public static void typyDanych() {
        byte b1 = 10;       // zmienna b1 jest zmienną prostego typu byte
        Byte b2 = 10;       // zmienna b2 jest zmianną typu obiektowego Byte
        
        System.out.println(b1);
        System.out.println(b2);        
        
        b2 = Byte.parseByte("20");
        
        System.out.println(b2);       
        
        short s1 = 10;
        Short s2 = Short.parseShort("100");

        System.out.println(s1);
        System.out.println(s2);                
        
        String napis = "jakiś napis";
        
        System.out.println(napis.toUpperCase());
    }
    
    public static void temperatura(){
        double temperatura = 0.0;
        
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.print("Wprowadź temperaturę: ");
        temperatura = inputScanner.nextDouble();
        
        System.out.println("Wprowadzona temperatura to: " + temperatura);        
    }
    
    public static void przedstawSie(){
        String imie;
        String nazwisko;
        
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.print("Wprowadź imię: ");
        imie = inputScanner.next();

        System.out.print("Wprowadź nazwisko: ");
        nazwisko = inputScanner.next();

        System.out.println("Twoje imię i nazwisko to: " + imie + " " + nazwisko);
    }
    
    public static void srednieTemperatury() {
        double[] temperatury = new double[7];
        Scanner inputScanner = new Scanner(System.in);

        for (int i = 0; i < temperatury.length; i++) {
            System.out.print("Wprowadź temperaturę z " + i + " dnia: ");
            temperatury[i] = inputScanner.nextDouble();
        }
        
        double sumaTemperatur = 0.0;
        
        for (double temp : temperatury) {
            sumaTemperatur += temp;
        }
        
        System.out.println("Średnia temperatura za siedem dni wynosi: " + (sumaTemperatur / temperatury.length));
      
    }
    
//    public static void main(String[] args) {
//        int liczbaPrzedmiotow = 3;
//        int liczbaOcen = 4;
//        
//        for (int pIndex = 0; pIndex < liczbaPrzedmiotow; pIndex++) {
//            for (int oIndex = 0; oIndex < liczbaOcen; oIndex++) {
//                
//            }
//        }
//        
//        for () {
//            System.out.println("Twoja srednia ocen z przedmiotu x to: " );
//        }
//    }
    
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);        
        int liczbaPrzedmiotow = 3;
        int liczbaOcen = 4;
        //int liczbaUczniow = 31;
        
        int[][] oceny;
        //int[][][] dziennikSzkolny = new int[liczbaPrzedmiotow][liczbaUczniow][liczbaOcen];
        
        oceny = new int[liczbaPrzedmiotow][liczbaOcen];
        
        for (int pIndex = 0; pIndex < liczbaPrzedmiotow; pIndex++) {
            for (int oIndex = 0; oIndex < liczbaOcen; oIndex++) {
                System.out.print("Podaj ocenę numer " + (oIndex + 1) + " dla przedmiotu numer " + (pIndex + 1) + ": ");
                oceny[pIndex][oIndex] = inputScanner.nextInt();
            }
        }        
        
        float sredniaWszystkichOcen = 0;
        for (int pIndex = 0; pIndex < liczbaPrzedmiotow; pIndex++) {
            float sredniaPrzedmiotu = 0;
            
            for (int ocena : oceny[pIndex]) {
                sredniaPrzedmiotu += ocena;
            }
            sredniaPrzedmiotu /= oceny[pIndex].length;
            sredniaWszystkichOcen += sredniaPrzedmiotu;
            System.out.println("Średnia ocen dla przedmiotu numer " + (pIndex + 1) + " wynosi: " + sredniaPrzedmiotu);
        }        
        sredniaWszystkichOcen /= oceny.length;
        System.out.println("Średnia wszystkich ocen wynosi: " + sredniaWszystkichOcen);
    }    
}
