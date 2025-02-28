import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("Enter your age"+age);
        if(age>=18){
            System.out.println("you are Eligible to vote");
        }
        else{
            System.out.println("you are not eligible to vote \n Try Again after some time");

        }
        sc.close();
    }
    
}
