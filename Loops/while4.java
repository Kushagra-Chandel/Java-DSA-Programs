package Loops;
// Sum of first n natural numbers using while loop

import java.util.Scanner;

public class while4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range :");
        int n = sc.nextInt(); // Range 
         int i =1;
         int sum =0;

         while(i<=n){
            sum = sum+i;
            i++;
         }
        System.out.println(sum);
         sc.close();
    }
    
}
