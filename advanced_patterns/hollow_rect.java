package advanced_patterns;

public class hollow_rect {
    public static void hollow_rectangle(int totrows,int totCols){
        // outer loop
        for(int i=1; i<=totrows;i++){
            //inner coulmns
            for(int j =1; j<=totCols; j++){
                //cell (i,j)
                if(i ==1 || i== totrows || j==1 || j== totCols){
                    //boundary cells
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollow_rectangle(10,7);
    }
}
