package xunit;

public class WasRun extends TestCase {

    public String log;
    public boolean wasRun;
    public boolean wasSetup;

    public WasRun(final String name) {
        super(name);
    }

    @Override
    public void setUp() {
        wasSetup = true;
        log = "setUp ";
    }

    public void testMethod() {
        wasRun = true;
        log += "testMethod";
    }
}
