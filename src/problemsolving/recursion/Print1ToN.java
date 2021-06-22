package problemsolving.recursion;

public class Print1ToN {
    /*
    Print 1 to n
     */

    // Using loop
    public void printTo(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    // Using Recursion (naive solution)
    public void printToUsingRecursion(int n) {
        if (n < 1) {
            return;
        }

        System.out.println(n);
        printToUsingRecursion(n - 1);
    }

    public void printToUsingRecursion2(int n) {
        if(n > 0)
        {
            printToUsingRecursion2(n - 1);
            System.out.print(n);
        }
        return;
    }


    public static void main(String[] args) {
        Print1ToN print1ToN = new Print1ToN();
//        print1ToN.printTo(6);
//        print1ToN.printToUsingRecursion(6);
        print1ToN.printToUsingRecursion2(6);
    }
}
