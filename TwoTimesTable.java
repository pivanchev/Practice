
package practice;
import java.util.Scanner;


public class TwoTimesTable {
    
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the multiplier: ");
        int multiplier=sc.nextInt();
        System.out.println("Please enter the starting number: ");
        int startingNumber=sc.nextInt();
        System.out.println("Please enter the ending number: ");
        int endingNumber=sc.nextInt();
         
        for(int i=startingNumber;i<=endingNumber;i++){
            System.out.println(multiplier + "*" + i + "=" + (multiplier*i));
        }
      
      } 
        
    }
    
  
