import java.util.Arrays;

public class palindrome {

  public static void main(String[] args) {
    String input = args[0];
    char[] forward_text = input.toCharArray();
    char[] backward_text = new char[50]; 

    for (int ind = forward_text.length - 1; ind >= 0; ind--) {
      for (int cnt = 0; cnt < forward_text.length; cnt++){
        backward_text[cnt] = forward_text[ind];
        ind--;
      }
    }
    for ( char x : forward_text ) System.out.print(x);
    for ( char y : backward_text ) System.out.print(y);
    if (Arrays.equals(forward_text, backward_text)) System.out.println("Palindrome");
    else System.out.println("Not a Palindrome");
  }
}
