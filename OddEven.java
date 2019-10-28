
package practice;
import java.util.Scanner;


public class OddEven {
    
    public static void main (String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number!");
        int num=scan.nextInt();
        
        
        if(num%2==0){
            System.out.println("This is an even number. ");
            
        }else{
            System.out.println("This is an odd number. ");
        }
        
        System.out.println("Try again!");
        
        
        
    }
    
}
