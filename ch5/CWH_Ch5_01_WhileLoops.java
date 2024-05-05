public class CWH_Ch5_01_WhileLoops {
    public static void main(String[] args) {

        int i=0;
        while (i<10){
            System.out.println("5 X "+(i+1)+" = "+((i+1)*5));
            i++;
        }

        while(true){
            System.out.println("I am the owner of this house!"); // Infinite Loop
        }
    }
}
