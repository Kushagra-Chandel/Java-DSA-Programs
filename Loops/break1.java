package Loops;

import java.util.Scanner;

// kep entering numbers till user enters a multiple of 10
public class break1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Enter your number: ");
            int n = sc.nextInt();

            if(n%10 == 0){
                break;
            }
            System.out.println(n);
        } while(true);
        sc.close();
    }
    
}
