package Task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class General {
    public static void main(String[] args) {
        System.out.println(isCorrectName("text.txt"));
        System.out.println(isCorrectName("document.doc"));
        System.out.println(isCorrectName("executor.exe"));
    }

    static boolean isCorrectName(String fileName) {
        Pattern pattern = Pattern.compile("^.*\\.(txt|doc)$");
        Matcher matcher = pattern.matcher(fileName);
        return matcher.matches();
    }
}
