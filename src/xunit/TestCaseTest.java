package xunit;

public class TestCaseTest extends TestCase {

    public TestCaseTest(final String name) {
        super(name);
    }

    public void testTemplateMethod() {
        WasRun test = new WasRun("testMethod");
        test.run();
        Assert.assertEquals("setUp testMethod tearDown", test.log);
    }

    public void testResult() {
        WasRun test = new WasRun("testMethod");
        TestResult result = test.run();
        Assert.assertEquals("1 run, 0 failed", result.getSummary());
    }

    public void testFailedResult() {
        WasRun test = new WasRun("testBrokenMethod");
        TestResult result = test.run();
        Assert.assertEquals("1 run, 1 failed", result.getSummary());
    }
}
