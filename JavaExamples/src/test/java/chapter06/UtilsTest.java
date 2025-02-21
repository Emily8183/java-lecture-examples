package chapter06;

// TODO: Add imports for JUnit 5
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UtilsTest {

    // TODO: Write a test for getInitials()
    @Test
    public void checkGetInitials() {
        String msg = "getInitials() should only return initials";
        String expected = "GH";
        String actual = Utils.getInitials("Gordon Hens");
        assertEquals(expected, actual, msg);
    }

}
