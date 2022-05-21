package net.roszczyk.mavenproject8;

/**
 *
 * @author roszczyr
 */
public class Mavenproject8 {

    public static int getNumberOfSeconds(int hour) 
    {
        if (hour < 0) {
            throw new IllegalArgumentException("Wartość godziny musi być większa od zera, a jest " + hour);
        }
        return hour * 60 * 60;
    }
    
    public static void main(String[] args) {
        int a = 100;
        int b = 0;
        
        try {
            System.out.println(a / b);
        }
        catch (ArithmeticException e) {
            System.out.println("Tu jest bład ale o tym wiemy");
        }
        
        int hour = -10;        
        int sec = 0;
        
        try {
            sec = getNumberOfSeconds(hour);
        }
        catch (ArithmeticException e) {                                     // 1
            System.out.println("Wystąpił bład obliczeń matematycznych");
        }
        catch (IllegalArgumentException e) {                                // 2
            sec = getNumberOfSeconds(hour * -1);
        }
        catch (Exception e)                                                 // 3
        {
            System.out.println("Wystąpił bład o którym nic nie wiemy");
        }
        finally {
            System.out.println("To się wykonuje po sprawdzeniu wszystkich błędów");
        }
        System.out.println("w godzinach mamy " + hour + " co daje " + sec + " sekund");
    }
}
