class Mythd1 extends Thread{
    public void run(){
        int i=0;
        while (i<10){
            System.out.println("Thank you so much__");
            try {
                Thread.sleep(1000); // Holds for 1 sec then moves further
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            i++;
        }
    }
}

class Mythd2 extends Thread{
    public void run(){
        int i=0;
        while (i<10){
            System.out.println("Thank you");
            i++;
        }
    }
}

public class CWH_Ch13_06_SleepMethodThreads {
    public static void main(String[] args) {

        Mythd1 th1 = new Mythd1();
        Mythd2 th2 = new Mythd2();

        th1.start();
        th2.start();

    }
}

