
package practice;
import java.util.Scanner;


public class OperationProgram {
    
    public static void main(String args[]){
        
        Scanner input=new Scanner(System.in);
        System.out.println("Press 'a' for an addition operation; ");
        System.out.println("Press 'b' for substraction operation: ");
        System.out.println("Press 'c' for multiplication: ");
        System.out.println("Press 'd' for division: ");
        System.out.println("Press 'e' to exit.");
        
        char choice=input.next().charAt(0);
        
            if(choice!='a'&&choice!='b'&&choice!='c'&&choice!='d'&&choice!='e'){
                 System.out.println("Invalid input!");
            }else{
                System.out.print("Enter the first number: ");
                double num1=input.nextInt();
                System.out.print("Enter the secont number: ");
                double num2=input.nextInt();
           
           
        
        if(choice=='a'|| choice=='A'){
            do {  
                double sum=num1+num2;
                System.out.println("The addition of " + num1 + " and " +num2 + " is " +sum + ".");
                break;
                }while(choice=='a'|| choice=='A');
            
       }else if(choice=='b'||choice=='B'){
       
            do{  
                double substraction=num1-num2;
                System.out.println("The substraction of " + num1 + " and " +num2 + " is " +substraction + ".");
                break;
            }while(choice=='b'||choice=='B');  
            
       }else if(choice=='c'||choice=='C'){
       
            do{  
                double multiplication=num1*num2;
                System.out.println("The multiplication of " + num1 + " and " +num2 + " is " +multiplication + ".");
                break;
            }while(choice=='c'||choice=='C');   
       
       }else if(choice=='d'||choice=='D'){
       
            do{  
                double division=num1/num2;
                System.out.println("The division of " + num1 + " and " +num2 + " is " + division + ".");
                break;
            }while(choice=='d'||choice=='D');

        }else{
                do{
                System.out.println("Exit!Thank you!");
                break;
                }while(choice=='e'||choice=='E');
        }
       
      }
    }
}
