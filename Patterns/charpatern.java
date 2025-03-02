package Patterns;

public class charpatern {
    public static void main(String[] args) {
        int n=4;
        char ch = 'A';

        // for outer loop
        for(int line =1; line<= n; line++){
            //inner loop
            // chars le rhe as a varibale name kyuki char ek reserved keyword hai
            for(int chars =1; chars <=line;chars++){
                System.out.print(ch);
                ch++;

            }
            System.out.println();
        }
        
    }
    
}
