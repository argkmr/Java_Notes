// Question no: 1, 2 and 3
class Good extends Thread{
    public void run(){                // For question number 1 put i<500 in both the class
        for (int i=0; i<5; i++) {
            System.out.println("Good Morning!");
        }
    }
}

class Well extends Thread{
    public void run(){
        for (int i=0; i<5; i++) {
            System.out.println("Welcome!");
            try{
                Thread.sleep(250);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class CWH_Ch13_07_PracticeSet {
    public static void main(String[] args) {

        Good g = new Good();
        Well w = new Well();

        g.setPriority(4);
        w.setPriority(9);
        System.out.println(g.getPriority());
        System.out.println(w.getPriority());

        g.start();
        w.start();

    }
}
