package Patterns;
/*  **** 
    *** 
    ** 
    *        */
public class inverstar {
    public static void main(String[] args) {
        int n=4; // number of lines to print star
             for(int i=1; i<=n; i++){
                for(int j =1; j<= n-i+1; j++){
                    System.out.print("*");
                }
                System.out.println();
             }
    }
}
