package kz.epam.khassenov.lecture03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherWorkWithGroupSample {
    public static void main(String[] args) {
        {
            Pattern pattern = Pattern.compile("J(\\w*)", Pattern.CASE_INSENSITIVE);
            String stringText = "Java is fun; JavaScript is funny.; JFunny ; just";
            Matcher matcher = pattern.matcher(stringText);
            while (matcher.find()) {
                System.out.println("Found '" + matcher.group(0)
                        + "' at position " + matcher.start(0)
                        + "-" + matcher.end());
                if (matcher.start(0) < matcher.end(0)) {
                    System.out.println("Suffix is " + matcher.group(1));
                }
            }
            System.out.println();
        }
        {
            String stringText =
                    "test a=\"1\" b=\"2\" c=\"3\" bar d=\"4\" e=\"5\"";
            System.out.println(stringText + "\n");
            Matcher matcher = Pattern.compile("([a-z]*)(([ \t]+[a-z]=\"[0-9]\")*)").matcher(stringText);
            while (matcher.find()){
                System.out.println(matcher.group());
                System.out.println(matcher.group(1));
                Matcher matcherSecond = Pattern.compile("([a-z])=\"([0-9])\"").matcher(matcher.group(2));
                while (matcherSecond.find()){
                    System.out.println(" " + matcherSecond.group(1) + " -> " + matcherSecond.group(2));
                }
            }
            System.out.println();
        }
        {
            Pattern pattern = Pattern.compile("J2SE");
            String candidateString_1 = "J2SE is the only for me";
            String candidateString_2 = "For me, it's J2SE, or nothing at all";
            String candidateString_3 = "J2SEistheonlyoneforme";

            Matcher matcher = pattern.matcher(candidateString_1);
            String stringMessage = ":" + candidateString_1 + ": matches?: ";
            System.out.println(stringMessage + matcher.lookingAt());

            matcher.reset(candidateString_2);
            stringMessage = ":" + candidateString_2 + ": matches?: ";
            System.out.println(stringMessage + matcher.lookingAt());

            matcher.reset(candidateString_3);
            stringMessage = ":" + candidateString_3 + ": matches?: ";
            System.out.println(stringMessage + matcher.lookingAt());
        }
    }
}
