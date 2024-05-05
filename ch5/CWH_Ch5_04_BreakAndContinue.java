public class CWH_Ch5_04_BreakAndContinue {
    public static void main(String[] args) {

        for (int i=0; i<10; i++){
            if (i==5){
                System.out.println("Here break is executed....");
                break;
            }else{
                System.out.println("5 X "+(i+1)+" = "+((i+1)*5));
            }
        }

        System.out.println();

        for (int i=0; i<10; i++){
            if (i%2==0){
                System.out.println("Here continue statement is executed.....");
                continue;
            }else {
                System.out.println("5 X "+(i+1)+" = "+((i+1)*5));
            }
        }
    }
}
