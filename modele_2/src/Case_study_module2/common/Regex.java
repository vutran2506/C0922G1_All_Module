package Case_study_module2.common;

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

    public static final String DATE_FORMAT = "\\d{2}[/]\\d{2}[/]\\d{4}";
    public static boolean validate(String regex, String input) {
        return Pattern.matches(regex, input);
    }
}
