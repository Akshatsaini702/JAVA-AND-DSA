package slidingwindow;

public class maxsumsubarraysizek {
    public static int maxsubarrsum(int arr[],int k){
        if(arr.length<k) return -1;

        int maxsum=0;
        int windowsum=0;
        for(int i=0;i<k;i++){
            windowsum+=arr[i];
        }
        maxsum=windowsum;

        for(int i=k;i<arr.length;i++){
            windowsum=windowsum+arr[i]-arr[i-k];

            maxsum=Math.max(maxsum,windowsum);
        }
        return maxsum;
    }
    public static void main(String args[]){
        int arr[]={500,800,600,900,100,200,300};

        System.out.println(maxsubarrsum(arr,3));
    }
    
}
