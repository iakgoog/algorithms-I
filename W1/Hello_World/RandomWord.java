import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
  public static void main(String[] args) {
    String champion = "";
    double i = 1.0;
    while (!StdIn.isEmpty()) {
      String contender = StdIn.readString();
      if (StdRandom.bernoulli(1.0 / i)) {
        champion = contender;
      }
      i += 1;
    }
    StdOut.printf(champion);
  }
}