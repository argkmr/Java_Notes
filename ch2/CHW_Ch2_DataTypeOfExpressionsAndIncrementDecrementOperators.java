public class CHW_Ch2_DataTypeOfExpressionsAndIncrementDecrementOperators {
    public static void main(String[] args) {

        byte x = 5;
        int y = 6;
        short z = 8;
        int a = y + z;
        float b = 6.54f + x;
        System.out.println(b);

        // Increment and Decrement Operators
        int i = 56; // Let int b = i++; // first b is assigned i (56) then i is incremented
        int j = 67; // Let int c = ++j; // first j is incremented then c is assigned j (68)
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);

        int w = 7;
        System.out.println( ++w *8);

        char ch = 'a';
        System.out.println(++ch);
    }
}
