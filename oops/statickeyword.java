package oops;
import java.util.*;
/*static keyword in java is used to share the same variable 
or method of a givrn class
properties functions blocks nested classes
' */

public  class statickeyword {
    public static void main(String args[]){
        student s1= new student();
        s1.schoolname="hsa";
        student s2= new student();
       s2.schoolname="kjdsvbgahwdv";
       System.out.println( s1.schoolname);
          System.out.println( s2.schoolname);
    }
    
}
class student {
    String name;
    int roll;
    static String schoolname;
    void setname(String name){
        this.name=name;
    }
    String getname(){
        return this.name;
    }

}
