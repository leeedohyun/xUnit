package xunit;

import java.util.ArrayList;
import java.util.List;

public class TestSuite {

    private List<WasRun> tests = new ArrayList<>();

    public void add(final WasRun test) {
        tests.add(test);
    }
    public TestResult run(final TestResult result) {
        tests.forEach(test -> {
            test.run(result);
        });
        return result;
    }
}
