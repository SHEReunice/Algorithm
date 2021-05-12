package hello;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String args[]) {
        String word = StdIn.readString();;
        int i = 0;
        while(!StdIn.isEmpty()) {
            String newWord = StdIn.readString();
            i++;
            if(StdRandom.bernoulli(1/i)) {
                word = newWord;
            }
        }
        StdOut.println(word);
    }
}
