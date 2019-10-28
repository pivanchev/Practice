
package practice;
import java.util.Scanner;

public class Grades {
    
    public static void ifExample(){
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number!");
        int grade=input.nextInt();
        
        if(grade>=70){
            System.out.println("Distinction");
        }
        
        else if(grade>=60&&grade<70){
            System.out.println("2.1");
        }
        
        else if(grade>=50&&grade<60){
            System.out.println("2.2");
        }
        
        else if(grade>=40&&grade<50){
            System.out.println("3rd");
        }
        
        else{
            System.out.println("Fail!");
        }
    }
    
    
}
