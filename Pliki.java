/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package net.roszczyk.pliki;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author roszczyr
 */
public class Pliki {
    String nazwaPliku = "plik.txt";
    int liczba = 12345678;
    String napis = "Jakiś napis";
    
    public void ZapisDoPliku()
    {
        FileWriter fileWriter = null;
        
        try {
            fileWriter = new FileWriter(nazwaPliku);
            fileWriter.write(Integer.toString(liczba));             // zapisujemy liczbę jako tekst
            // fileWriter.write(liczba);                            // zapisujemy liczbę jako wartość binarną
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                }
                catch (Exception e)
                {
                    System.out.println(e.getMessage());
                }
            }    
        }
    }
    
    public void OdczytZPliku()
    {
        File file = new File(nazwaPliku);
        FileReader fileReader = null;
        BufferedReader bufferedReader;
        int wartosc = 0;
        
        try {
           fileReader = new FileReader(file);
           bufferedReader = new BufferedReader(fileReader);
           String liczbaJakoNapis = bufferedReader.readLine();
           wartosc = Integer.parseInt(liczbaJakoNapis);
           bufferedReader.close();
        }
        catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
        }
        
        System.out.println(wartosc);
    }
    
    public static void main(String[] args) {
        Pliki pliki = new Pliki();
        pliki.ZapisDoPliku();
        pliki.OdczytZPliku();                
    }
}
