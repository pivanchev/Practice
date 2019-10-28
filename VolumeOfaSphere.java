
package practice;
import java.util.Scanner;
import java.lang.Math;

public class VolumeOfaSphere {
    
    static public void Sphere(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Radius: ");
        double radius=scan.nextDouble();
    
        double volume=((4/3)*(Math.PI)*(Math.pow(radius, 3)));
        
        System.out.println("The volume of the Sphere is " + volume);
        
    }
    
}
