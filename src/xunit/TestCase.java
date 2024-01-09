package xunit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCase {

    private final String name;

    public TestCase(final String name) {
        this.name = name;
    }

    public TestResult run() {
        final TestResult result = new TestResult();
        result.testStarted();
        setUp();

        try {
            final Method method = getClass().getMethod(name);
            method.invoke(this);
        } catch (final NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }

        tearDown();
        return result;
    }

    public void setUp() {
    }

    public void tearDown() {
    }
}
