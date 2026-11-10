package oops;
//classes group of entities and objects entities in the real world
/*class can have attributes and fucntions */
//we can define object of child class with respect to parent class
public class classandobject {
    public static void main(String args[]){
        pen p1= new pen();//created a [pen object called p1]
        p1.setcolor("red");
        System.out.println(p1.color);
        p1.settip(5);
         System.out.println(p1.tip);
    }

    
}
class pen{
    String color;
    int tip;
    void setcolor(String newcolor){
        color=newcolor;
    }
    void settip(int newtip){
        tip=newtip;
    }
}
class student{
    String name;
    int marks;
    char ch;

}