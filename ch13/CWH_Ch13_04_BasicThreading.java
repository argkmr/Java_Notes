class Thr implements Runnable{

    String str1, str2;

    public Thr(String str1, String str2){
        this.str1 = str1;
        this.str2 = str2;
    }

    public void run(){
        System.out.println("If you are good at something never do it for free!");
        System.out.println(str1 +" "+ str2);
    }
}

public class CWH_Ch13_04_BasicThreading {
    public static void main(String[] args) {
        Thr bullet = new Thr("Mohan", "Sohan");
        Thread thd = new Thread(bullet, "Harry");
//  Thread thd = new Thread(new Thr("Monah", "Sohan"), "Harry"); --> Alternate way
        thd.start();
        System.out.println(thd.getId());
        System.out.println(thd.getName());
    }
}
