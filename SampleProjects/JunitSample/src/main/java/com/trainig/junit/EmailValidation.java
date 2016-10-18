/**
 * 
 */
package com.trainig.junit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 559207
 *
 */
public class EmailValidation {
    
    private Pattern pattern;
    private Matcher matcher;
    
    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    
    /**
     * @param args
     */
    
    public static void main(String[] args) {
        System.out.println(System.getenv("JAVA_HOME"));
        
    }
    
    public boolean validateEmail(String str) {
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
