/*
Find the value of one number and raised to the power of another.
 */
package practice;
import java.util.Scanner;


public class PowerOfNumber {
    
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int num1=sc.nextInt();
        System.out.println("Please enter the second number: ");
        int num2=sc.nextInt();
        
        int mult=1;
       
        for(int i=1;i<=num2;i++){
           mult*=num1;
        }
        
        System.out.println(mult);

      }
    }  

