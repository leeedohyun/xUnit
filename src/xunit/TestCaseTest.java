package xunit;

public class TestCaseTest extends TestCase {

    public TestCaseTest(final String name) {
        super(name);
    }

    public void testTemplateMethod() {
        WasRun test = new WasRun("testMethod");
        final TestResult result = new TestResult();
        test.run(result);
        Assert.assertEquals("setUp testMethod tearDown", test.log);
    }

    public void testResult() {
        WasRun test = new WasRun("testMethod");
        final TestResult result = new TestResult();
        test.run(result);
        Assert.assertEquals("1 run, 0 failed", result.getSummary());
    }

    public void testFailedResult() {
        WasRun test = new WasRun("testBrokenMethod");
        final TestResult result = new TestResult();
        test.run(result);
        Assert.assertEquals("1 run, 1 failed", result.getSummary());
    }

    public void testFailedResultFormatting() {
        TestResult result = new TestResult();
        result.testStarted();
        result.testFailed();
        Assert.assertEquals("1 run, 1 failed", result.getSummary());
    }

    public void testSuite() {
        TestSuite suite = new TestSuite();
        suite.add(new WasRun("testMethod"));
        suite.add(new WasRun("testBrokenMethod"));
        final TestResult result = new TestResult();
        suite.run(result);
        Assert.assertEquals("2 run, 1 failed", result.getSummary());
    }
}
