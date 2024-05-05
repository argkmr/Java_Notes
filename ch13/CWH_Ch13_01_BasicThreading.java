// This method of achiving threading is called as threading by extending Thread class

class Mythread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<1) {
            System.out.println("This is Mythread1 run funciton....");
            System.out.println("Hey how you doin!");
            i++;
        }
    }
}

class Mythread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<1) {
            System.out.println("This is Mythread2 run funciton....");
            System.out.println("And I just want a million dollars!");
            i++;
        }
    }
}

public class CWH_Ch13_01_BasicThreading {
    public static void main(String[] args) {
        Mythread1 mt1 = new Mythread1();
//        Thread tr = new Thread(); --> Won't print anything
        Mythread2 mt2 = new Mythread2();

        mt1.start(); // For sometime this will be executed and
        System.out.println(mt1.getId());
        System.out.println(mt1.getName());// This'll give a default name as we haven't given any name to the thread

        System.out.println();

        mt2.start(); // For some time this will be executed
        System.out.println(mt2.getId());
        System.out.println(mt2.getName());

//      Notice the order in which the above line of code are executed. It is randome as we are using
//      Threads instead of normal methods for the implementation
    }
}
