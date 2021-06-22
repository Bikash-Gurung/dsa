package problemsolving.recursion;

public class PrintNToOne {
    static void printTo1(int n){
        if(n==0){
            return;
        }

        System.out.print(n);
        printTo1(n-1);
    }

    public static void main(String[] args) {
        printTo1(8);
    }
}
