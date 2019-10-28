
package practice;
import java.util.Scanner;


public class Exercise1 {
    
    public static void mathOperations(){
    
    Scanner scan=new Scanner(System.in);
    System.out.println("Please enter a decimal number! ");
    double num1=scan.nextDouble();
    System.out.println("Please enter a second decimal number! ");
    double num2=scan.nextDouble();
    
    
    double num3=num1+num2;
    double num4=num1-num2;
    double num5=num1/num2;
    double num6=num1*num2;
    
    
    
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
    
    
    
    
    }
}