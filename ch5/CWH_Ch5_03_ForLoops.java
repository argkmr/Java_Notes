public class CWH_Ch5_03_ForLoops {
    public static void main(String[] args) {

        for (int i=0; i<10; i++){
            System.out.println("5 X "+(i+1)+" = "+((i+1)*5));
        }

        System.out.println();

        for (int i=10; i>=1; i--){
            System.out.println("5 X "+(i)+" = "+((i)*5));
        }

        for (;;){  // Infinite for loop
            System.out.println("Here are the awards!");
        }
    }
}
