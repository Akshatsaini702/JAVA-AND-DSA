package arrays;

public class linearsearch {
    public static int right(int marks[],int key){
        for(int i=0;i<marks.length;i++){
            if(marks[i]==key){
                return i;
            };
         
        };
         return -1;
    };
   
   
    public static void main(String args[]){
        int marks[]={1,2,3,4,5,6,6,7,7,8};
        int key=7;
        int index=right(marks,key);
        if(index==-1){
            System.out.println("element not found");
        }
        else{
            System.out.println("the key is at index:" + index);
        }
        
    }
    
}
