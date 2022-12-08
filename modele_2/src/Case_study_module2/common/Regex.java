package Case_study_module2.common;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
    public static  final String ID_ROOM_REGEX = "^SVRO-\\d{4}$";

    public static final String USE_AREA = "^\\d+$";

    public static final String ID_VILLA_REGEX = "^SVVL-\\d{4}$";

    public static final String NAME_REGEX = "^[A-Z].+";

    public static final String AREA_POOL_REGEX = "^0*([3-9]+\\d|[1-2]\\d{2,})([.]\\d+)?$";

    public static final String RENT_COST_REGEX = "^0*\\d+([.]\\d+)?$";

    public static final String MAXIMUM_NUMBER_USER_REGEX = "^(0?[1-9]|1[0-9])$";

    public static final String FLOOR_NUMBER_REGEX = "^\\d+([.]\\d+)?$";

    public static final String RENT_TYPE_REGEX = "^[A-Z][a-z]+$";

    public static final String ROOM_STANDARD_REGEX = "^[A-Z][a-z]+$";
    public static final  String FREE_SERVICE = "^[A-Za-z0-9].+";

    public static final String DATE_FORMAT = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)" +
            "(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?" +
            "(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])" +
            "(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";

    public static boolean regexAge(String regex, String scanner){
        if (Pattern.matches(regex, scanner)){
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dateOfBirth = LocalDate.parse(scanner,dateTimeFormatter);
            LocalDate now = LocalDate.now();
            int age = Period.between(dateOfBirth, now).getYears();
            if (age<100 && age>18){
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }

    public static boolean validate(String regex, String input) {
        return Pattern.matches(regex, input);
    }

}
