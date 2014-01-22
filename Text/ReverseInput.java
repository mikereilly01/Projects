public class ReverseInput {

  public static void main(String[] args) {
    String in = args[0];
    char[] input = in.toCharArray();
    System.out.println('\n');
    for (int ind = input.length - 1; ind >= 0; ind--) {
      System.out.print(input[ind]);
    }
    System.out.println('\n');
  }
}
