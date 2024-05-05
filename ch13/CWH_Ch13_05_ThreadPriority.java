class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }

    public void run(){
        int i=0;
        while(i<40) {
            System.out.println("This is " + this.getName());// + " and the id is " + this.getId());
            i++;
        }
    }
}


public class CWH_Ch13_05_ThreadPriority {
    public static void main(String[] args) {

        MyThr1 mtr1 = new MyThr1("Harry1*");
        MyThr1 mtr2 = new MyThr1("Harry2****");
        MyThr1 mtr3 = new MyThr1("Harry3************");

        mtr1.setPriority(Thread.MIN_PRIORITY); // 0
        mtr2.setPriority(Thread.NORM_PRIORITY);
        mtr3.setPriority(Thread.MAX_PRIORITY); // 10

        mtr1.start();
        mtr2.start();
        mtr3.start();


    }
}
