import java.util.Scanner;

public class area {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float rad = sc.nextInt();
        float area_circle = 3.14f *rad*rad;  //Java automatically takes decimal value as double so need to mention it as float
        System.out.println(area_circle);
        sc.close();
    }
    
}
