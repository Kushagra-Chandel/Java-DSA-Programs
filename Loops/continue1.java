package Loops;
// tp print number 1 to 5 but as soon as 3 comes skip it
public class continue1 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }
        
    }
    
}
