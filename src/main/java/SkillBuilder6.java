
/**
 * SkillBuilder6 is a class for completing this Skill
 * Builder assignment in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class SkillBuilder6 {

    // replace this line with your constants

    public static String findTYPattern(String s) {
        // replace this line with your code
        String str = s.toUpperCase();
        int t = str.indexOf('T');
        int y = str.indexOf('Y');
        if(t == -1 | y == -1 | y < t){
            return "";
        }
        return s.substring(t,y + 1);
    }
}
