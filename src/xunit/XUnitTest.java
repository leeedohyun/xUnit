package xunit;

public class XUnitTest {
    public static void main(String[] args) {
        WasRun test = new WasRun("testMethod");
        System.out.println(test.wasRun); // false
        test.testMethod();
        System.out.println(test.wasRun); // true
    }
}
