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

    public String getSizeString(TShirtSize size)
    {
        switch (size) {
            case XS:
                return "koszulka w rozmiarze ekstra małym";
            case S:
                return "koszulka w rozmiarze małym";                
            case M:
                return "koszulka w rozmiarze średnim";                
            case L:
                return "koszulka w rozmiarze dużym";                
            case XL:
                return "koszulka w rozmiarze ekstra dużym";                
            default:
                return "koszulka w rozmiarze nieznanym";
        }
    }
    
    public static void main(String[] args) {
        TShirt shirt = new TShirt(TShirtSize.M, "Fruit Colour");
        
        System.out.println(shirt.manufacturer + " rozmiar: " + shirt.getSizeString(shirt.size) + "(" + shirt.size + ")");
    }
}
