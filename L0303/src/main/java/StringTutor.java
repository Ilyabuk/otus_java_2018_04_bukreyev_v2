/**
 * Created otusjava by Ilya on 4/27/18.
 */
import static org.junit.Assert.*;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTutor {
    /**
     * Убедитесь, что приветствие greeting имеет вид
     * Привет, Иван Иванов!
     * или
     * Привет,Петр Первый!
     * т.е. начинается на Привет, заканчивается на !
     * и содержит 2 слова для имени и фамилии,
     * причем имя и фамилия не короче 3 букв
     * и начинаются с большой буквы
     */
    public boolean checkGreeting(String greeting) {
        if (!greeting.endsWith("!")) {
            return false;
        }
        Pattern p = Pattern.compile("/*,.*!");
        Matcher m = p.matcher(greeting);
        String s = null;
        if (m.find()) {
            s = (String) (m.group().subSequence(1, m.group().length() - 1));
        }
        String newStirng = s.trim();
        String[] result = newStirng.split(" ");


        if (result.length < 2) {
            return false;
        }

        if (!Character.isUpperCase(result[0].charAt(0)) ||
                !Character.isUpperCase(result[1].charAt(0))) {
            return false;
        }
        return greeting.startsWith("Привет,") && greeting.endsWith("!")
                && result[0].length() > 3 && result[1].length() > 3;
    }

    @Test
    public void testCheckGreeting() {
        assertTrue(checkGreeting("Привет, Иван Иванов!"));
        assertTrue(checkGreeting("Привет,Петр Первый!"));
        assertTrue(checkGreeting("Привет, Петр Первый!"));
        assertTrue(checkGreeting("Привет, Петр Первый !"));

        assertFalse("В начале должно быть слово Привет и запятая",
                checkGreeting("Здравствуйте, Петр Первый!"));
        assertFalse("В конце должен быть восклицательный знак",
                checkGreeting("Привет, Петр Первый"));
        assertFalse("Имя слишком короткое",
                checkGreeting("Привет, Ли Сунь!"));
        assertFalse("Фамилия слишком короткая",
                checkGreeting("Привет, Куй Ли!"));
        assertFalse("Должны быть указаны и имя, и фамилия",
                checkGreeting("Привет, Петр!"));
        assertFalse("Первая буква имени должна быть заглавной",
                checkGreeting("Привет, петр Первый!"));
        assertFalse("Первая буква фамилии должна быть заглавной",
                checkGreeting("Привет, Петр первый!"));
    }
}
