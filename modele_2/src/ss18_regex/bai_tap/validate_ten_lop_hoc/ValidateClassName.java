package ss18_regex.bai_tap.validate_ten_lop_hoc;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {
    private static final String NAME_CLASS_REGEX = "^[C|A|D]\\d{4}[G|H|I|K|L|M]$";
    private static Matcher matcher;
    private static Pattern pattern;
public ValidateClassName(){
    pattern = Pattern.compile(NAME_CLASS_REGEX);

}
public  boolean validate(String regex){
    matcher = pattern.matcher(regex);
    return matcher.matches();
}

}
