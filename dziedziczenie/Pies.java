/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.roszczyk.mavenproject6;

/**
 *
 * @author roszczyr
 */
public class Pies extends Ssak implements Dzwiek {
    public Pies(String nazwa, int wiek) {
        super("pies", nazwa, wiek);
    }

    @Override
    public String getDzwiek() {
        return "hau, hau";
    }
}
