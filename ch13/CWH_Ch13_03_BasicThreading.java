class Mythr extends Thread {
    Mythr(String str){
        super(str);
    }
    public void run(){
        System.out.println("This is runnalbe interface method....");
    }
}

public class CWH_Ch13_03_BasicThreading {
    public static void main(String[] args) {
        Mythr mt1 = new Mythr("Harry");
        Mythr mt2 = new Mythr("Anurag Kumar");

        mt1.start(); // mt.run(); This also works fine but use start() only as it is more general
        System.out.println("The id of the thread is: "+mt1.getId());
        System.out.println("The name of the thread is: "+mt1.getName());

        System.out.println();

        mt2.start();
        System.out.println("The id of the thread is: "+mt2.getId());
        System.out.println("The name of the thread is: "+mt2.getName());
    }
}
