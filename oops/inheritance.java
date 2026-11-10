package oops;

public class inheritance {
    public static void main(String[] args) {
        fish tuna = new fish();
        tuna.eat();
    }
    
}
class animal{
    void eat(){
System.out.println("fish");    }
    
}
//"extends" used to inherit the propeerty frommparent class to child classs
class fish extends animal{
    
}