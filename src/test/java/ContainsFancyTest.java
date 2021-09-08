import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContainsFancyTest {

    @Test
    public void fancyTest() {
        // GIVEN
        String phrase1 = "This is fancy";

        //WHEN
        boolean testResult = ContainsFancy.containsFancy(phrase1);

        //THEN
        Assertions.assertEquals(true, testResult );
    }

    @Test
    public void negativfancyTest() {
        // GIVEN
        String phrase1 = "This is not true";

        //WHEN
        boolean testResult = ContainsFancy.containsFancy(phrase1);

        //THEN
        Assertions.assertEquals(false, testResult );

    }
}
