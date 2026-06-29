package gr.aueb.cf.ch19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateMatcher {

    static void main() {
        String dates = "06/12/2020 xxx yyy ;;;;; 11/05/1999cxxxxxxx02/27/2000, 12/12/2025";

        Pattern pattern = Pattern.compile("(\\d{2})/(\\d{2})/(\\d{4})");
        Matcher matcher = pattern.matcher(dates);

        while (matcher.find()) {
            System.out.println(matcher.group());

            String month = matcher.group(1);
            String day = matcher.group(2);
            String year = matcher.group(3);

            String grDate = day + "/" + month + "/" + year;
            System.out.println(grDate);
        }
    }
}
