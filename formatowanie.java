/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package net.roszczyk.mavenproject9;

import java.util.Formatter;
import java.util.Locale;

/**
 *
 * @author roszczyr
 */
public class Mavenproject9 {

    public static void main(String[] args) {
        String imie = "Maciej";
        int liczba = 100;
        double zmienna = 123.456;
                      
        System.out.println("Witaj" + " " + imie + " " + liczba + " " + zmienna);
        
        Formatter formatter = new Formatter();
        
        formatter.format("Witaj %s liczba int to: %d natomiast szesnastkowo to będzie: 0x%x liczba zmiennoprzecinkowa to: %.3f", imie, liczba, liczba, zmienna);
        
        /*
          %[indeks][flagi][szerokość][.precyzja]wartość
          %b    - wartość logiczna
          %s    - wartość napisowa (String)
          %d    - liczba całkowita
          %x    - liczba całkowita hexadecymenalna
          %f    - liczba zmiennoprzecinkowa
        
          %%    - zastępuje znak procent w formatowanym stringu
          %n    - przejście do nowego wiersza
        */        
        
        String formattedString = formatter.toString();
        System.out.println(formattedString);
        
        System.out.format("Witaj %s %n", imie);
        
        System.out.format("(%2$s) (%3$s) (%1$s) %n", "wartość pierwsza", "wartość druga", "wartość trzecia");
        
        System.out.format("Witaj %1$s liczba int to: %2$d natomiast szesnastkowo to będzie: 0x%2$x liczba zmiennoprzecinkowa to: %3$.3f %n", imie, liczba, zmienna);
        
        System.out.format("(%1$20s) (%1$s) %n", "napis");
        
        System.out.format("(%1$f) (%1$.1f) (%1$10.1f) %n", zmienna);
        
        double drugaZmienna = 12345.12345;
        
        System.out.format(Locale.UK, "UK -> %,.3f%n", drugaZmienna);
        System.out.format(Locale.US, "US -> %,.3f%n", drugaZmienna);
        System.out.format(Locale.GERMAN, "DE -> %,.3f%n", drugaZmienna);
        System.out.format(Locale.forLanguageTag("PL"), "PL -> %,.3f%n", drugaZmienna);
        
        /*
        
        ,  - należy użyć separatora grup liczb (separator tysięczny)
        (  - należy użyć nawiasu dla liczb ujemnych
        0  - należy uzupełnić liczbę zerami wiodącymi
        
        */
        
        System.out.format("%(08d%n", -liczba);
        
        // %2$08.3f         -> %2 - druga zmienna
        //                  -> $08.3f uzupełnione zerami do 8 miejsc i trzy miejsca po przecinku
        
        double pierwszaZmienna = 1.234567;
        
        System.out.format("%1$08.3f %2$08.3f", pierwszaZmienna, drugaZmienna);
    }
}
