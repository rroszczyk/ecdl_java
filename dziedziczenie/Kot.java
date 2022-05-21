/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.roszczyk.mavenproject6;

/**
 *
 * @author roszczyr
 */
public class Kot extends Zwierze implements Dzwiek {
    public Kot(String nazwa, int wiek) {
        super("kot", nazwa, wiek);
    }    

    @Override
    public String getDzwiek() {
        return "mrrrr, mrrrr";
    }
}
