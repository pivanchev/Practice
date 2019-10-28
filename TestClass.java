
package Increment;


public class TestClass {
    
    public static void main(String args[]){
        int max=0;
        max(2,5,max);
        System.out.println(max);
    }
    
    public static void max(int n1,int n2,int max){
        if(n1>n2){
        max=n1;    
        }else{
        max=n2;
        }
        
    }
}
