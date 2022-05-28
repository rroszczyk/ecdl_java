/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package net.roszczyk.binarne;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author roszczyr
 */
public class Binarne {

public String przedstawSie()
    {
        String imie;
        
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.print("Wprowadź imię: ");
        imie = inputScanner.next();

        System.out.format("Witaj %s, będę o Tobie pamiętać", imie);
        return imie;
    }
    
    public void zapamietajImie(String plik, String imie, int licznik)
    {
        DataOutputStream outputStream = null;
        
        try {           
            outputStream = new DataOutputStream(new FileOutputStream(plik));
            outputStream.writeInt(licznik);
            outputStream.writeUTF(imie);
            outputStream.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void witaj()
    {
        DataInputStream inputStream = null;
        String plikImie = "imie.bin";
        
        try {
            inputStream = new DataInputStream(new FileInputStream(plikImie));
            int licznik = inputStream.readInt();  // wczytanie licznika odwiedzin
            String imie = inputStream.readUTF();
            System.out.format("Witaj ponownie %s!%nWidzę Cie po raz %d", imie, licznik);
            inputStream.close();
            zapamietajImie(plikImie, imie, licznik + 1);
        }
        catch (Exception e)
        {
            System.out.println("Nie znam Cię");
            String imie = przedstawSie();
            zapamietajImie(plikImie, imie, 1);
        }
    }        
   
    public static void main(String[] args) {
        Binarne binarne = new Binarne();
        binarne.witaj();
    }
}
