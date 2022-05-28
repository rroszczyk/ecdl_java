/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package net.roszczyk.witaj;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author roszczyr
 */
public class Witaj implements Serializable {
    String imie;
    int licznik;
    
    public void przedstawSie()
    {
        String imie;
        
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.print("Wprowadź imię: ");
        imie = inputScanner.next();

        System.out.format("Witaj %s, będę o Tobie pamiętać", imie);
        this.imie = imie;
    }    

    public Witaj() 
    {
        this.licznik = 1;
    }
    
    public void hello()
    {
        System.out.format("Witaj ponownie %s!%nWidzę Cie po raz %d", imie, licznik);    
    }
    
    public void zapamietajDane()
    {
        try {
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("imie.bin"));
            output.writeObject(this);
            output.close();
        }
        catch (Exception ex) {
            System.err.println(ex.getMessage());
        }        
    }
    
    public static void main(String[] args) {
        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("imie.bin"));
            Witaj witaj = (Witaj)input.readObject();
            witaj.hello();
            witaj.licznik++;
            input.close();
            witaj.zapamietajDane();
        }
        catch (Exception e) {
            Witaj witaj = new Witaj();
            witaj.przedstawSie();
            witaj.zapamietajDane();
        }
    }
}
