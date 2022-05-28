/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package net.roszczyk.pliki;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author roszczyr
 */
public class Pliki {
    String nazwaPliku = "plik.txt";
    int liczba = 12345678;
    String napis = "Jakiś napis";
    
    public void zapisDoPliku()
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
    
    public void odczytZPliku()
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
    
    public String przedstawSie()
    {
        String imie;
        
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.print("Wprowadź imię: ");
        imie = inputScanner.next();

        System.out.format("Witaj %s, będę o Tobie pamiętać", imie);
        return imie;
    }
    
    public void zapamietajImie(String plik, String imie)
    {
        FileWriter fileWriter = null;
        
        try {
            fileWriter = new FileWriter(plik);
            fileWriter.write(imie);
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
    
    public void witaj()
    {
        BufferedReader bf = null;
        String plikImie = "imie.txt";
        
        try {
            bf = new BufferedReader(new FileReader(new File(plikImie)));
            String imieZPliku = bf.readLine();
            bf.close();
            System.out.format("Witaj ponownie %s!%n", imieZPliku);
        }
        catch (Exception e)
        {
            System.out.println("Nie znam Cię");
            String imie = przedstawSie();
            zapamietajImie(plikImie, imie);
        }
        finally {
            try {
                if (bf != null) {
                    bf.close();
                }
            } 
            catch (Exception e)
            {
                System.err.println(e.getMessage());
            }
        }
    }
    
    public static void main(String[] args) {
        Pliki pliki = new Pliki();
        pliki.zapisDoPliku();
        pliki.odczytZPliku();                       
        pliki.witaj();
    }
}
