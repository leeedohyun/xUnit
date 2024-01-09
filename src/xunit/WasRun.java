package xunit;

public class WasRun extends TestCase {

    public boolean wasRun;
    public boolean wasSetup;

    public WasRun(final String name) {
        super(name);
    }

    @Override
    public void setUp() {
        wasSetup = true;
    }

    public void testMethod() {
        wasRun = true;
    }
}
