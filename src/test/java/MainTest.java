import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void shouldSayHelloWorld() {
        Assert.assertEquals("Hello World", Main.sayHello("Hello World"));
    }

    @Test
    public void shouldSayHolaMundo() {
        Assert.assertEquals("Hola Mundo", Main.sayHello("Hola Mundo"));
    }

}