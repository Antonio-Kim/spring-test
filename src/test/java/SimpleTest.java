import com.antoniok.Passenger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;

public class SimpleTest {
    private static final String APPLICATION_CONTEXT_XML_FILE_NAME = "classpath:application-context.xml";
    private ClassPathXmlApplicationContext context;
    private Passenger expectedPassenger;

    @Before
    public void setup() {
        context = new ClassPathXmlApplicationContext(APPLICATION_CONTEXT_XML_FILE_NAME);
        expectedPassenger = PassengerUtil.getExpectedPassenger();
    }

    @Test
    public void testInitPassenger() {
        Passenger passenger = (Passenger) context.getBean("passenger");
        assertEquals(expectedPassenger, passenger);
    }
}
