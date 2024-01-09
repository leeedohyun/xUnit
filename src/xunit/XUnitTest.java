package xunit;

public class XUnitTest {
    public static void main(String[] args) {
        final TestSuite suite = TestCaseTest.suite();
        final TestResult result = new TestResult();
        suite.run(result);
        System.out.println(result.getSummary());
    }
}
