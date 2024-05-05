public class CWH_Ch2_OperatorPrecedenceAndAssociativity {
    public static void main(String[] args) {
        // Precedence & Associativity

        int a = 6*5-34/2;
        //  Highest precedence goes to * and /.
        //  They are then evaluated on the basis of left to right associativity.
        //    = 30-34/2
        //    = 30-17
        //    = 13

        int b = 60/5-34*2;
        //   = 12-34*2
        //   = 12-68
        //   = -56

        System.out.println(a);
        System.out.println(b);

        // Quick Quiz
        int x =6;
        int y = 1;
        int k = x * y/2;

        int l = 0;
        int m = 0;
        int n = 10;
        int p = l*l - (4*n*m)/(2*n);
        System.out.println(p);
    }
}
