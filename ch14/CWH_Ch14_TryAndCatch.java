public class CWH_Ch14_TryAndCatch {
    public static void main(String[] args) {

        int a = 6000, b=0;
        try{
            int c = a/b;
            System.out.println("Answer: "+c);
        }catch (Exception error){
            System.out.println("You can't keep the denominator zero");
            System.out.println("Error by java: "+error); // Optional Statement.....
        }
        System.out.println("End of the program.....");// If try and catch has not been used then this line
//     of code would not have been executed and the program could have crashed in between.
    }
}
