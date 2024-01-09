package xunit;

public class TestCaseTest extends TestCase {

    private WasRun test;

    public TestCaseTest(final String name) {
        super(name);
    }

    @Override
    public void setUp() {
        test = new WasRun("testMethod");
    }

    public void testRunning() {
        Assert.assertEquals(false, test.wasRun);
        test.run();
        Assert.assertEquals(true, test.wasRun);
    }

    public void testSetUp() {
        Assert.assertEquals(false, test.wasSetup);
        test.run();
        Assert.assertEquals(true, test.wasSetup);
    }
}
