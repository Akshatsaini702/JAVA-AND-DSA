import java.util.Arrays;
public class secondlargenoinarr{
    public static int secondlargeno(int arr[]){
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
         for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                 secondlargest= largest;
                largest= arr[i];
               
            } else if(secondlargest<largest && arr[i]!=largest){
                secondlargest=arr[i];
            }
         };
         return secondlargest;

    }
        

    

    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,8};
      System.out.println("the second largest no is:" +   secondlargeno(arr));;
     

    }






















}
