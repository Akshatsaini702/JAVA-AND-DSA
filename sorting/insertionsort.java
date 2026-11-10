package sorting;
//insertion sort is based on the idea that one element from unsorted array is picked and placed at its correct position in sorted array

public class insertionsort {
    public static void insert(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int current=arr[i+1];
            int j=i;
            while(j>=0 && arr[j]>current){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }


    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]);
        }
        System.out.println();


}
    public static void main(String args[]){
        int arr[]={4,5,7,3,6,8,9};
        insert(arr);
        printarr(arr);
    
    
    
    }}
