
package Increment;


public class TestClass1 {
    
    public static void main(String args[]){
        int i=6;
        while(i<=6){
            method(i,2);
            i++;
        }
        
    }
    public static void method(int n1,int num){
        for(int j=1;j<=n1;j++){
            System.out.println(num + " ");
            num*=2;
        }
        
        System.out.println();
    }
}
