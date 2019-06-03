package kz.epam.khassenov.lecture03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherSample {
    public static void main(String[] args) {
        {
            Pattern pattern = Pattern.compile("1*00");//{n}1 + {1}0
            Matcher matcher = pattern.matcher("11111100");
            boolean isMatch = matcher.matches();
            System.out.println(isMatch);
            System.out.println();
        }
        String stringFirst = "<body><h1> a<<<b </h1></body>";
        Pattern pattern;
        {
            String stringPattern = "<+";
            String[] result;
            pattern = Pattern.compile(stringPattern);
            result = pattern.split(stringFirst);
            printTokens(result);
            System.out.println();
        }
        {
            String stringPattern = "<?";
            String[] result;
            pattern = Pattern.compile(stringPattern);
            result = pattern.split(stringFirst);
            printTokens(result);
            System.out.println();
        }
        {
            String stringPattern = "<*";
            String[] result;
            pattern = Pattern.compile(stringPattern);
            result = pattern.split(stringFirst);
            printTokens(result);
            System.out.println();
        }
    }

    private static void printTokens(String[] tokens) {
        for (String string : tokens){
            if ("".equals(string)){
                System.out.print("\"\"" + "|");
            }
            else {
                System.out.print(string + "|");
            }
        }
    }
}
