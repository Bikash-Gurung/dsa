package problemsolving.recursion;

public class DecimalToBinary {

    static void toBinary(int n){
        if(n==0) return;
        toBinary(n/2);
        System.out.print(n%2);
    }

    public static void main(String[] args) {
        toBinary(11);
    }
}
