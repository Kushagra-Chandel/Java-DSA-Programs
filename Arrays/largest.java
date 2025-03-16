package Arrays;
// to get the largest element from the array
public class largest {
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;// it will store -infinity
// if need to find smalles then can take INTEGER.MAX_vlaue which will provide +infinity
        for(int i=0; i<numbers.length;i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,6,9,3,4};
        System.out.println("largest value is : " +getLargest(numbers));

    }
    }