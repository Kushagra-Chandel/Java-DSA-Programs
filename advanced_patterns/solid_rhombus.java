package advanced_patterns;

public class solid_rhombus {
    public static void sol_rhombus(int n){
            for( int i =1; i<=n; i++){
                //spaces
                for(int j=1; j<=(n-i);j++){
                    System.out.print(" ");
                }

                //stars
                for(int j=1; j<=n;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        public static void main(String[] args) {
            sol_rhombus(5);
        }
    }

    
