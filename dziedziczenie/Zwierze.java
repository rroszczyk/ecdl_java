/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.roszczyk.mavenproject6;

/**
 *
 * @author roszczyr
 */
public class Zwierze {
    public String gatunek;
    public int wiek;
    private final String nazwa;
    
    public Zwierze(String gatunek, String nazwa, int wiek) {
        this.gatunek = gatunek;
        this.nazwa = nazwa;
        this.wiek = wiek;
    }
    
    public String getNazwa() {
        return gatunek + ": " + nazwa;                
    }
    
    public int getWiek(){
        return wiek;
    }
}
