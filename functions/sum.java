package functions;

import java.util.Scanner;


public class sum {

    public static int Calcsum(int a, int b){// parameters of formal parameters
        int sum = a + b;
        return sum; // jb maine int calcsum diya 
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
       int sum = Calcsum(a,b); // arguments  or actual parameters
       System.out.println("sum is :" +sum);
        sc.close();
    }
    

}
