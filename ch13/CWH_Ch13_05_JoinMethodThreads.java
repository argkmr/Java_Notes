class Mythrd1 extends Thread{
    public void run(){
        int i=0;
        while (i<5){
            System.out.println("Thank you so much__");
            i++;
        }
    }
}

class Mythrd2 extends Thread{
    public void run(){
        int i=0;
        while (i<5){
            System.out.println("Thank you");
            i++;
        }
    }
}

public class CWH_Ch13_05_JoinMethodThreads {
    public static void main(String[] args) {

        Mythrd1 th1 = new Mythrd1();
        Mythrd2 th2 = new Mythrd2();

        th1.start();
        try{
            th1.join(); // After the executation of th1 then th2 will start
        }catch(Exception e) {
            System.out.println(e);
        }
        th2.start();
    }
}
