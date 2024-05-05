// This method to achive threading is called as threading by implementing runnable interface

class MyThreadOne implements Runnable {
    int i=0;
    @Override
    public void run() {
        while(i<45) {
            System.out.println("This is thread 1 in porcess.....");
            System.out.println("How are you!");
            i++;
        }
    }
}

class MyThreadTwo implements Runnable {
    int i=0;
    @Override
    public void run() {
        while(i<45) {
            System.out.println("This is thread 2 in porcess.....");
            System.out.println("I am fine how are you!");
            i++;
        }
    }
}


public class CWH_Ch13_02_BasicThreading {
    public static void main(String[] args) {
        MyThreadOne bullet1 = new MyThreadOne();
        Thread gun1 = new Thread(bullet1);
//        Thread gun1 = new Thread(new MyThreadOne()); --> Alternate way

        MyThreadTwo bullet2 = new MyThreadTwo();
        Thread gun2 = new Thread(bullet2);
//        Thread gun2 = new Thread(new MyThreadTwo()); --> Alternate way

        gun1.start();
        gun2.start();
    }
}
