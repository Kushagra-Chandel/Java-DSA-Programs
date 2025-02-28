package Loops;
// print numbers from 1 to n

import java.util.Scanner;

public class while3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Range: ");
        int n = sc.nextInt();

        int i=1;
        while(i<=n){
            System.out.print(i+" ");
            i++;
        }
        sc.close();
    }
    
}
