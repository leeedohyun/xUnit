package xunit;

public class WasRun extends TestCase {

    public String log;

    public WasRun(final String name) {
        super(name);
    }

    @Override
    public void setUp() {
        log = "setUp ";
    }

    public void testMethod() {
        log += "testMethod";
    }

    @Override
    public void tearDown() {
        log += " tearDown";
    }

    public void testBrokenMethod() {
        throw new AssertionError();
    }
}
