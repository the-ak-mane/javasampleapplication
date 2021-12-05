import org.junit.Assert;
import org.junit.Test;

public class MyAppTests {

    @Test
    public void addTest() {
        int answer = Main.add(20, 40);

        // the answer must be 60
        Assert.assertEquals(answer, 60);
    }

    @Test
    public void multiplyTest() {
        int answer = Main.multiply(20, 40);

        // the answer must be 60
        Assert.assertEquals(answer, 800);
    }

    @Test
    public void divideTest() {
        int answer = Main.divide(40, 20);

        // the answer must be 60
        Assert.assertEquals(answer, 2);
    }
}
