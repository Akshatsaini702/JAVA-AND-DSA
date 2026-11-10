package arrays;

public class pairsinarray {
    public static void pair(int marks[])
{ for(int i=0;i<marks.length;i++){
    int current=marks[i];
    for(int j=i+1;j<marks.length;j++){
        System.out.print("(" + current + "," + marks[j] + ")");
    }
    System.out.println();
}



}    public static void main(String args[]){
     int marks[]={2,3,4,5,6,7};
     pair(marks)
;

    }
    
}
