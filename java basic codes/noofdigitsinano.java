import java.util.*;
public class noofdigitsinano{
public static int counter(int n){
      int count=0;
    while(n>0)
{
  
    n=n/10;
    count++;
};
return count;

};
public static void main(String args[]){
    System.out.println(counter(123));
}
}