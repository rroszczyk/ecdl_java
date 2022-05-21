/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package net.roszczyk.mavenproject6;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author roszczyr
 */
public class Mavenproject6 {

    public static void main(String[] args) {
        List<Zwierze> zwierzyniec = new LinkedList<>();
        
        zwierzyniec.add(new Pies("Franek", 2));
        zwierzyniec.add(new Kot("Mruczek", 1));
        zwierzyniec.add(new Kon("Marusia", 4));
        
        for (Zwierze z:zwierzyniec) {
            Dzwiek dzwiek = (Dzwiek)z;
            Ruch ruch = (Ruch)z;
            System.out.println(z.rodzaj + ": " + z.getNazwa() + " ma " + z.getWiek() + " lat");           
            System.out.println(z.gatunek + " wydaje dźwięk: " + dzwiek.getDzwiek() + " i " + ruch.RodzajRuchu());            
        }
    }
}

/*
public interface Ruch {
    void RodzajRuchu();
}
        
public class Ssak extends Zwierze implements Ruch {
    
}

public class Ryba extends Zwierze implements Ruch {
    
}

public class Ptak extends Zwierze implements Ruch {
    
}

*/