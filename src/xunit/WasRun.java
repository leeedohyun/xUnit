package xunit;

public class WasRun extends TestCase {

    public boolean wasRun;
    public boolean wasSetup;

    public WasRun(final String name) {
        super(name);
    }

    public void testMethod() {
        wasRun = true;
    }
}
