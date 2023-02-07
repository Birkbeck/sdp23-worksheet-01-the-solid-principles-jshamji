import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreeterTest {
    @Test
    public void testSaysHello() {
        IFormality normal = new NormalFormality();
        Greeter greeter = new Greeter();
        assertEquals("Hello.", greeter.greet(normal));
    }

    @Test
    public void testSaysHelloFormally() {
        IFormality formal = new FormalFormality();
        Greeter greeter = new Greeter();
        assertEquals("Good evening", greeter.greet(formal));
    }

    @Test
    public void testSaysHelloCasually() {
        IFormality casual = new CasualFormality();
        Greeter greeter = new Greeter();
        assertEquals("Goodday?", greeter.greet(casual));
    }

    @Test
    public void testSaysHelloIntimately() {
        IFormality intimate = new IntimateFormality();
        Greeter greeter = new Greeter();
        assertEquals("Hello darling!", greeter.greet(intimate));
    }
}
