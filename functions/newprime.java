package functions;
// optimized code for finding the no is prime or not
// secondly we have a function that will print the primes in range using isPrime as a helper 
public class newprime {
    public static boolean isPrime(int n) {// to check prime or not
        if(n ==2){
            return true;
        }
        for( int i=2; i<=Math.sqrt(n); i++){ //optimized loop
            if(n% i == 0){
                return false;
            }
        }
        return true;
    }

    public static void primesInRange(int n){// to print the primes in range
        for(int i=2; i<=n;i++){
            if(isPrime(i)){
                //true
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        //System.out.println(isPrime(7)); // to use for checking prime or not
        primesInRange(20); // to print in range
        ;
    }
    
}
