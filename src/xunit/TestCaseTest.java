package xunit;

public class TestCaseTest extends TestCase {

    public TestCaseTest(final String name) {
        super(name);
    }

    public void testRunning() {
        WasRun test = new WasRun("testMethod");
        Assert.assertEquals(false, test.wasRun);
        test.run();
        Assert.assertEquals(true, test.wasRun);
    }
}
