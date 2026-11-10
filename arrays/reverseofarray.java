package arrays;
//reverse of an array


public class reverseofarray {
    public static int rev (int marks[]){
        int first=0,last=marks.length-1;
        while(first<=last){
            int temp=marks[last];
            marks[last]=marks[first];
            marks[first]=temp;
            first++;
            last--;

        }  ;
        return 1;
        
    
    }
    public static void main(String args[]){
        int marks[]={2,3,4,5,2,3};
        rev(marks);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println();

    }
    
}
