/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.roszczyk.mavenproject6;

/**
 *
 * @author roszczyr
 */
public class Kon extends Zwierze implements Dzwiek {
    public Kon(String nazwa, int wiek) {
        super("kon", nazwa, wiek);
    }    

    @Override
    public String getDzwiek() {
        return "dźwięk paszczowy";
    }
}
