import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator c;


    @BeforeEach
    void commentBeforeeachTest(){
        System.out.println("Test starts.");
        c = new Calculator();
    }

    @Test
    void twoPlusOne() {
        System.out.println("Test 2 + 1 ");
        int r = c.Add(2, 1);
        assertEquals(3, r);

    }

    @Test
    void twoMinusOne() {
        System.out.println("Test 2 - 1 ");
        int r = c.Substraction(2, 1);
        assertEquals(3, r);

    }

    @AfterEach
    void commentAfterEechTest(){
        System.out.println("Test finished!");
    }
}
