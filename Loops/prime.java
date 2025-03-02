package Loops;

import java.util.Scanner;

// to check number is prime or not
public class prime {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n ==2){
            System.out.println("n is prime");
        } else{
            boolean isPrime = true;

        for(int i=2; i<=n-1; i++){

            if (n%i ==0) {// n is a multiple of i ( i not equal)
                isPrime = false;
                
            }
        }
        if(isPrime== true){
            System.out.println("n is prime number");
        }else{
            System.out.println("n is not prime number");
        }
        sc.close();
        }

        
    }  
    
}
