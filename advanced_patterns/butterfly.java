package advanced_patterns;
// to print the butterfly pattern and divide the above pattern into two subparts 1 half and 2 half
public class butterfly {
    public static void butterfly_pat(int n){
        //1st half above part print kr rhe 
        for(int i=1; i<=n; i++){
            //stars ->i
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }


            //spaces -> 2 * (n-i)
            for( int j=1; j<=2 *(n-i); j++){
                System.out.print(" ");
            }

            //stars -> i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd half of butterfly
        for(int i=n; i>=1; i--){
            // rest above wale code hi paste kr skte
            //stars ->i
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }


            //spaces -> 2 * (n-i)
            for( int j=1; j<=2 *(n-i); j++){
                System.out.print(" ");
            }

            //stars -> i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        butterfly_pat(4);
    }
    
}
