
package practice;


public class TestClass2 {
    
    public static void main(String args[]){
        int x=1;
        System.out.println("Before the call x is " + x);
        
        Println("Hello",x);
        System.out.println("After the call x is " + x);
        
    }
    
    
    public static void Println(String message,int n){
        while(n>0){
            System.out.println("n is " + n);
            System.out.println(message);
            n--;
        }
    }
}
