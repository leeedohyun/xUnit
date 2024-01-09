package xunit;

public class TestResult {

    private int runCount = 0;
    private int failureCount = 0;

    public void testStarted() {
        runCount++;
    }

    public void testFailed() {
        failureCount++;
    }

    public String getSummary() {
        return runCount + " run, " + failureCount + " failed";
    }

}
