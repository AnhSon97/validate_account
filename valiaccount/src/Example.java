import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {
    private final String REGEX = "^[_a-z0-9]{6,}$";

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();

    }
}

class Test {
    private static Example example;

    public static final String[] validAccount = new String[] { "123abc_", "_abc123", "______", "123456","abcdefgh" };
    public static final String[] invalidAccount = new String[] { ".@", "12345", "1234_", "abcde" };

    public static void main(String[] args) {
        example = new Example();

        for (String ac : validAccount){
            boolean is = example.validate(ac);
            System.out.println("account" + "-" + ac + "-" + is);
        }

        for (String ac : invalidAccount){
            boolean is = example.validate(ac);
            System.out.println("account" + "-" + ac + "-" + is);
        }

    }
}
