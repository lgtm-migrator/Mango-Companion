package dev.tr7zw.mango_companion.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChapterParser {

    private static Pattern pattern = Pattern.compile("((C|c)hapter|(C|c)h)(\\.|\\s|-)([0-9]+((-|\\.)[0-9]+)?)");
    
    public static String getChapterId(String base) {
        Matcher matcher = pattern.matcher(base);
        if(!matcher.find()) {
            return null;
        }
        return matcher.group(5).replace('-', '.');
    }
    
}