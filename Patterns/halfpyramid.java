package Patterns;

public class halfpyramid {
    public static void main(String[] args) {
        int n =4;
        for(int i=1; i<=n;i++){
            // numbers to print
            for(int j=1; j<=i; j++){
                System.out.print(j);// print j number and use print not println)
            }
            System.out.println();
        }
    }
    
}
