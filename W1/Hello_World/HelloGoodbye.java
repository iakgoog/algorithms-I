public class HelloGoodbye {
  public static void main(String[] args) {
    if (args.length > 0) {
      System.out.printf("Hello %s and %s.\n", args[0], args[1]);
      System.out.printf("Goodbye %s and %s.\n", args[1], args[0]);
    }
  }
}