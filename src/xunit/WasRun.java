package xunit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class WasRun {

    private final String name;
    public boolean wasRun;

    public WasRun(final String name) {
        this.name = name;
    }

    public void testMethod() {
        wasRun = true;
    }

    public void run() {
        try {
            final Method method = getClass().getMethod(name);
            method.invoke(this);
        } catch (final NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
