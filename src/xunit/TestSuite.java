package xunit;

import java.util.ArrayList;
import java.util.List;

public class TestSuite {

    private List<TestCase> tests = new ArrayList<>();

    public void add(final TestCase test) {
        tests.add(test);
    }
    public TestResult run(final TestResult result) {
        tests.forEach(test -> {
            test.run(result);
        });
        return result;
    }
}
