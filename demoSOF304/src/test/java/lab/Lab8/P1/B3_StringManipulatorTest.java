package lab.Lab8.P1;

import com.SOF304.yennth.lab.Lab8.P1.B3_StringManipulator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class B3_StringManipulatorTest {

    private B3_StringManipulator manipulator;
    
    @BeforeEach
    public void setUp() {
        manipulator = new B3_StringManipulator();
    }
    
    @Test
    public void testConcatenateValid1() {
        String result = manipulator.concatenate("Hello", "World");
        assertEquals("HelloWorld", result);
    }

    @Test
    public void testConcatenateInValid2() {
        String result = manipulator.concatenate(null, "World");
        assertEquals("HelloWorld", result);
        assertThrows(NullPointerException.class , () -> {
            manipulator.concatenate(null, "World");
        });
    }

    @Test
    public void testConcatenateInValid3() {
        String result = manipulator.concatenate(null, null);
        assertEquals("HelloWorld", result);
        assertThrows(NullPointerException.class , () -> {
            manipulator.concatenate(null, null);
        });
    }

    @Test
    public void testConcatenateInValid4() {
        String result = manipulator.concatenate("HelloWorld", null);
        assertEquals("HelloWorld", result);
        assertThrows(NullPointerException.class , () -> {
            manipulator.concatenate("HelloWorld", null);
        });
    }

    @Test
    public void testConcatenateInValid5() {
        String result = manipulator.concatenate("", "");
        assertEquals("", result);
        assertThrows(IllegalArgumentException.class , () -> {
            manipulator.concatenate("", "");
        });
    }
}
