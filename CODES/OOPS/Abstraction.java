// Bike is an abstract class , in it run() is an abstract method(function)
// Example1

abstract class Bike{
    abstract void run();
}
class Honda4 extends Bike{
    void run(){
        System.out.println("running safely");
    }
    public static void main(String args[]){
        Bike obj = new Honda4();
        obj.run();
    }
}


// Example 2
/*
abstract class Bank{
    abstract int getRateOfInterest();
}
class SBI extends Bank{
    int getRateOfInterest(){
        return 7;
    }
}
class PNB extends Bank{
    int getRateOfInterest(){
        return 8;
    }
}
class TestBank{
    public static void main(String args[]){
        Bank b = new SBI();     //if object is PNB, method of PNB will be invoked
        int interest = b.getRateOfInterest();
        System.out.println("Rate of Interest is: "+interest+"%");
    }}
*/