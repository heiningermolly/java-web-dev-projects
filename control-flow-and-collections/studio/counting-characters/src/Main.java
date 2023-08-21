
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        char[] charsInQuote = quote.toCharArray();

        HashMap<String,Integer> charCount = new HashMap<>();

        for (char i : charsInQuote) {
            String str = String.valueOf(i);
            Integer value = charCount.get(str);
//            if (!charCount.containsKey(String.valueOf(i))) {
//            charCount.put(String.valueOf(i), 1);
//            } else {
//                charCount[String.valueOf(i)].value = charCount[String.valueOf(i)].value += 1;
//            }

//            System.out.println(i);
            if (!charCount.containsKey(str)) {
                charCount.put(str, 1);
            } else {
                charCount.put(str, value + 1);
            }
        }
        System.out.println(charCount);
    }
}