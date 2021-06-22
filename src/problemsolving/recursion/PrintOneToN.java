package problemsolving.recursion;

public class PrintOneToN {

    static void printToN(int n){
        if(n==0){
            return;
        }

        printToN(n-1);
        System.out.print(n);
    }

    public static void main(String[] args) {
        printToN(8);
    }
}
