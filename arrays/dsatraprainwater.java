package arrays;
//trapped water=(water height-height of bar)*width of bar
//water height=min(maxleft,max right)
/*AUXILIARY ARRAYS= helper arrays {store left and right max boundary in another arrays and then min value of both
 should be put at the water height*/

public class dsatraprainwater {
    public static int trap(int marks[]){
        //calculated left max boundary for a bar starting i=0
        int leftmax[]= new int[marks.length];
        leftmax[0]=marks[0];
        for(int i=1;i<marks.length;i++){
            leftmax[i]=Math.max(marks[i],leftmax[i-1]);
        };
       //calculated right max boundary for every bar starting marks.length-1
        int rightmax[]= new int[marks.length];
        rightmax[marks.length-1]=marks[marks.length-1];
        for(int i=marks.length-2;i>=0;i--){
            rightmax[i]=Math.max(marks[i], rightmax[i+1]);
        };
        //calculated trapped water using formula written below
         int trappedwater=0;
        for(int i=0;i<marks.length;i++){
            int waterlevel=Math.min(leftmax[i], rightmax[i]);
            trappedwater+=waterlevel-marks[i];
            
        }
        return trappedwater;
    }
    public static void main(String args[]){
        int marks[]={4,2,0,6,3,2,5};
        System.out.println("the trapped rainwater is:" + trap(marks));
        }
    
}