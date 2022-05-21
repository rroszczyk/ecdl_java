/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.roszczyk.mavenproject6;

/**
 *
 * @author roszczyr
 */
public class Ssak extends Zwierze implements Ruch {

    public Ssak(String gatunek, String nazwa, int wiek) {
        super(gatunek, nazwa, wiek);
        this.rodzaj = "ssak";
    }
    
    @Override
    public String RodzajRuchu() {
        return "biega";
    }
    
}
