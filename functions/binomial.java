package functions;
// to get the binomial coefficient nCr
public class binomial {

    public static int factorial(int var0) {
        int var1 = 1;
  
        for(int var2 = 1; var2 <= var0; ++var2) {
           var1 *= var2;
        }
  
        return var1;
     }

     public static int bincoeff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r); 

        int bincoeff = fact_n / (fact_r * fact_nmr);
        return bincoeff;

     }
     public static void main(String[] args) {
        System.out.println(bincoeff(5, 02));
     }

    
    
}
