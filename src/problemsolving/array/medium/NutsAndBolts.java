package problemsolving.array.medium;

import java.util.HashMap;

public class NutsAndBolts {
//    Given a set of N nuts of different sizes and N bolts of different sizes. There is a one-one mapping between
//    nuts and bolts. Match nuts and bolts efficiently.

//    Comparison of a nut to another nut or a bolt to another bolt is not allowed. It means nut can only be compared
//    with bolt and bolt can only be compared with nut to see which one is bigger/smaller.
//    The elements should follow the following order ! # $ % & * @ ^ ~ .

    static void nutboltmatch(char nuts[], char bolts[], int n) {
        HashMap<Character, Integer> order = new HashMap<>();
        order.put('!', 0);
        order.put('#', 1);
        order.put('$', 2);
        order.put('%', 3);
        order.put('&', 4);
        order.put('*', 5);
        order.put('@', 6);
        order.put('^', 7);
        order.put('~', 8);

        HashMap<Character, Integer> hash = new HashMap<>();

        // creating a hashmap for nuts
        for (int i = 0; i < n; i++)
            hash.put(nuts[i], i);

        // searching for nuts for each bolt in hash map
        for (int i = 0; i < n; i++)
            if (hash.containsKey(bolts[i]))
                nuts[i] = bolts[i];

        // print the result
        System.out.println("matched nuts and bolts are-");
        for (int i = 0; i < n; i++)
            System.out.print(nuts[i] + " ");
        System.out.println();
        for (int i = 0; i < n; i++)
            System.out.print(bolts[i] + " ");
    }

    public static void main(String[] args) {
        int n = 9;
        char nuts[] = {'^', '&', '%', '@', '#', '*', '$', '~', '!'};
        char bolts[] = {'~', '#', '@', '%', '&', '*', '$', '^', '!'};

        nutboltmatch(nuts, bolts, n);
    }
}
