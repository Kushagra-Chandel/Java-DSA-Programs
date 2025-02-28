import java.util.Scanner;

public class perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Length = sc.nextInt();      // yha integer tha isiliye nextInt liiya vrna nextFloat lete
        int Breadth = sc.nextInt();
       int Peri_Rectangle = 2*(Length + Breadth);
        System.out.println(Peri_Rectangle);
        sc.close();
    }
    
}
