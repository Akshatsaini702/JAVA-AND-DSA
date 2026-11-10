import java.util.*;
class evenoddsum{
  public static void main(String []args)
   {
    Scanner sexy=new Scanner(System.in);
    int n=sexy.nextInt();
    System.out.println("enter the number of integers you want to input:" + n);
    int evensum=0,oddsum=0;
         int num=0;
      

    for(int i=0;i<n;i++){
      System.out.println("enter the integer");
      num=sexy.nextInt();
      if(num%2==0){
        evensum+=num;

      }
      else{
        oddsum+=num;
      };


    }
    System.out.println("the sum of odd numbers is :"+ oddsum);
     System.out.println("the sum of even numbers is :"+ evensum);


  }
}
      


      


