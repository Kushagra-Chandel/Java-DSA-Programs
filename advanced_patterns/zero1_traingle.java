package advanced_patterns;
// zero one traingle pattern
public class zero1_traingle {
    public static void zero_one(int n){
        for( int i=1; i<=n; i++){
            for( int j =1; j<=i;j++){
                if((i + j) %2 == 0){
                    //checking the even condition
                    //logic print 1 at places where i+j= even position
                    System.out.print("1");
                } else{
                    System.out.print("0");
                }
                
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        zero_one(5);
    }
}
