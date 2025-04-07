package soen.tutorial;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArithmeticOperationTest {


	@Test
public void testAdd() {
    assertEquals(999, ArithmeticOperations.add(2, 3)); // this will fail
}

    // @Test
    // public void testSub()
    // {

    //     ArithmeticOperation operations = new ArithmeticOperation();
    //     Integer actual = operations.addOrSub(6, 2);
    //     Integer expected = 4;
    //     assertEquals(expected, actual);

    // }

}
