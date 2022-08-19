import org.junit.Assert;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ReportTest {


    static final Logger logger = Logger.getLogger(ReportTest.class.getName());
    @BeforeAll
    public static void beforeAll() {
        logger.log(Level.INFO, "Starting test in class MainTest");
    }


    @Test
    void zeroReport() throws Exceptions1 {
        Banker b = new Banker();
        String r = b.makeReport(0);
        assertEquals("Report 1",r);
        assertThrows(Exceptions1.class, () -> b.makeReport(0), "Number of report is greater than five and less than one." )

    }

    @Test
    void fiveReport() throws Exceptions1 {
        Banker b = new Banker();
        String r = b.makeReport(5);
        assertEquals("Report 5",r);



    }

    @Test
    void twoReport() throws Exceptions1 {
        Banker b = new Banker();
        String r = b.makeReport(2);
        assertEquals("Report 2",r, "Test passed");

    }
}
