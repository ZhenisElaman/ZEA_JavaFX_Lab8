package zea_jUnit;


import static javafxapplication.FXMLDocumentController.completing;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;

public class JUnitTest {

    @Test
    public void test1FXML() throws Exception {
        assertTrue(completing(1, 0, 6) == 30.00);
        assertTrue(completing(1, 2, 3) == 81);
        //assertTrue(completing(1, 2, 5) == 2.31);
    }

    @Test
    public void test2FXML() throws Exception {
        try {
            assertTrue(completing(-3, 3, 6) == 0);
            fail("Нет ошибки при делении на 0");
        } catch (Exception thrown) {
            assertNotEquals("", thrown.getMessage());
        }
    }
}