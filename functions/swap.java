package functions;

public class swap {
    public static void swap1(int a, int b){
        //swap
        int temp=a;
        a =b;
        b = temp;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    public static void main(String[] args) {
        //swap values exchange
        int a= 5;
        int b=10;
        swap1(a,b);
    }
    
}
