import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {
    @Test
    public void basicTests() {
        assertEquals("One", Kata.switchItUp(1));
        assertEquals("Three", Kata.switchItUp(3));
        assertEquals("Five", Kata.switchItUp(5));

    }

    private static class Kata {
        public static String switchItUp(int number) {
            Map<Integer, String> integerStringMap = new HashMap<>();
            integerStringMap.put(0, "Zero");
            integerStringMap.put(1, "One");
            integerStringMap.put(2, "Two");
            integerStringMap.put(3, "Three");
            integerStringMap.put(4, "Four");
            integerStringMap.put(5, "Five");
            integerStringMap.put(6, "Six");
            integerStringMap.put(7, "Seven");
            integerStringMap.put(8, "Eight");
            integerStringMap.put(9, "Nine");
            return integerStringMap.getOrDefault(number, " ");
        }
    }
}
//            Или вот так:
//            Map.of(1, "One", 3, "Three", 5, "Five").getOrDefault(number, " ");

//              Или вот так:
//              String s = switch (number) {
//                case 1 -> "One";
//                case 2 -> "Two";
//                case 3 -> "Three";
//                case 4 -> "Four";
//                case 5 -> "Five";
//                case 6 -> "Six";
//                case 7 -> "Seven";
//                case 8 -> "Eight";
//                case 9 -> "Nine";
//                default -> " ";
//            };
//            return s;
