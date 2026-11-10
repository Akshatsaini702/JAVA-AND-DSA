package divideandconquer;

public class quicksort {
     public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
             System.out.println(arr[i]+" ");

        }};
        public static void quicksorting(int arr[],int si ,int ei){
            if(si>=ei){
                return;
            };
            //lastelement
            int pidx=partition(arr,si,ei);
            quicksorting(arr,si,pidx-1);//left
            quicksorting(arr, pidx+1, ei);//right

        }
        public static int partition(int arr[],int si,int ei){
            int pivot=arr[ei];
            int i=si-1;//to make place for elements smaller than pivot
     for(int j=si;j<=ei;j++){
        if(arr[j]<pivot){
            i++;
            //swap
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }
     }
     i++;
      int temp=pivot;
            arr[ei]=arr[i];
            arr[i]=temp;
            return i;
        }
        public static void main(String args[]){
        int arr[]={6,3,9,5,2,8,-5};
        quicksorting(arr,0,arr.length-1);
        printarr(arr);}
    
}
