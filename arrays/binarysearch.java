package arrays;

public class binarysearch {

    public static int bs(int marks[],int key){
        int start=0,end=marks.length-1;
        while(start<=end){
             int mid=(start+end)/2;
             //comparisons
             if(marks[mid]==key){
                return mid;
             };
             if(marks[mid]>key){
                end=mid-1;

             }
             else{
                start=mid+1;
             };
        }
        return -1;
    }
    public static void main(String args[]){
        int marks[]={2,4,6,8,10,12,14,16};
        int key =10;
        System.out.println("the number is at index:" + bs(marks, key));

    }
}
