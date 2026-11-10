package arrays;

public class printsubarray {
    public static void print(int marks[]){
        int ts=0;
        for(int i=0;i<marks.length;i++){
           int start=i;
            for(int j=i;j<marks.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(marks[k]);
                   
                }
                System.out.println();
                 ts++;

            }System.out.println("total subarrays are:" + ts)  ;

        }
        System.out.println(ts);    }
    public static void main(String args[]){
        int marks[]={2,3,4,5,6,7,7,8,9,0,10};
        print(marks);
        
    }
    
}
