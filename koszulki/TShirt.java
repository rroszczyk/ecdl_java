/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package net.roszczyk.mavenproject7;

/**
 *
 * @author roszczyr
 */
public class TShirt {
    private TShirtSize size;
    private String manufacturer;
    
    public TShirt(TShirtSize size, String manufacturer)
    {
        this.size = size;
        this.manufacturer = manufacturer;
    }

    public static void main(String[] args) {
        TShirt shirt = new TShirt(TShirtSize.M, "Fruit Colour");
        
        System.out.println(shirt.manufacturer + " rozmiar: " + shirt.size);
    }
}
