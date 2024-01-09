package xunit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCase implements Test {

    private final String name;

    public TestCase(final String name) {
        this.name = name;
    }

    public void run(final TestResult result) {
        result.testStarted();
        setUp();

        try {
            final Method method = getClass().getMethod(name);
            method.invoke(this);
        } catch (final NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            result.testFailed();
        }

        tearDown();
    }

    public void setUp() {
    }

    public void tearDown() {
    }
}
