/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package net.roszczyk.ecdlpr1;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author roszczyr
 */
/*

LISTA

Anna -> Ewa -> Piotr -> Łukasz -> null
^       ^
|       |


HASHSET

123 -> 536 -> 453 -> 446 -> 656 -> 256

Anna       ==> 123 --> Anna
Ewa        ==> 536 --> Ewa
Piotr      ==> 453 --> Piotr
Łukasz     ==> 446 --> Łukasz
Aleksandra ==> 656 --> Aleksandra
Aleksander ==> 256 --> Aleksander

HASHMAP

Słoń        ==> 444 --> Słoń (ssak)


*/
public class EcdlPr1 {

    public static void main(String[] args) {
        System.out.println("Ten program będzie robił listy");
        
        List<Integer> liczby;        
        List<String> imiona;
        List<String> kolejneImiona;
        
        imiona = new LinkedList<>();
        kolejneImiona = new LinkedList<>();
        liczby = new LinkedList<>();
        liczby.add(1);
        liczby.add(5);
        liczby.add(7);
        
        imiona.add("Anna");   // 0
        imiona.add("Ewa");    // 1
        imiona.add("Piotr");  // 2
        imiona.add("Łukasz"); // 3
                
        kolejneImiona.add("Marek");
        kolejneImiona.add("Ela");
        kolejneImiona.add("Ola");
        
        for (String imie:imiona) {
            System.out.println(imie);            
        }
        
        System.out.println("Pierwsze imię z listy: " + imiona.get(0));
        System.out.println("Ostatnie imię z listy: " + imiona.get(imiona.size() - 1));
        System.out.println("----------------------------------------------------------------");
        
        imiona.addAll(kolejneImiona);
        
        for (String imie:imiona) {
            System.out.println(imie);            
        }
        
        System.out.println("Pierwsze imię z listy: " + imiona.get(0));
        System.out.println("Ostatnie imię z listy: " + imiona.get(imiona.size() - 1));        
        
        System.out.println(imiona.contains("Ewa"));
        
        System.out.println("----------------------------------------------------------------");        
        Set<String> setImiona = new HashSet<>();
        
        setImiona.add("Anna");   
        setImiona.add("Ewa");    
        setImiona.add("Piotr");  
        setImiona.add("Łukasz"); 
        setImiona.add("Aleksandra"); 

        for (String imie:setImiona) {
            System.out.println(imie);            
        }
        System.out.println(setImiona.size());
        System.out.println(setImiona.contains("Piotr"));    // true
        System.out.println(setImiona.contains("Karol"));    // false
        System.out.println(setImiona.remove("Piotr"));
        System.out.println(setImiona.size());
        
        //   klucz, wartość
        Map<String, String> mapa = new HashMap<>();
        
        mapa.put("sikorka", "ptak");
        mapa.put("słoń", "ssak");
        mapa.put("bocian", "ptak");
        mapa.put("pies", "ssak");

        System.out.println("----------------------------------------------------------------");                
        System.out.println(mapa.size());
        System.out.println(mapa.isEmpty());
        System.out.println(mapa.containsKey("słoń"));
        System.out.println(mapa.get("słoń"));
        System.out.println("Iterowanie po 'słowniku' poprzez klucz");                
        for (String key : mapa.keySet()) {
            String value = mapa.get(key);
            System.out.println(value);
        }
        
        System.out.println("Iterowanie po 'słowniku' poprzez parę klucz - wartość");                
        for (Map.Entry<String, String> entry : mapa.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            
            System.out.println(key + ":" + value);
        }
    }
}


/*
                                    LISTA           ZBIÓR          MAPA
zachowanie kolejności elementów      tak             nie            nie 
powtarzalne elementy                 tak             nie            nie dla kluczy

*/
