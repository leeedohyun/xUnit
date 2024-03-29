package xunit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestSuite implements Test {

    private List<Test> tests = new ArrayList<>();

    public TestSuite() {
    }

    public TestSuite(final Class<? extends TestCase> testClass) {
        Arrays.stream(testClass.getDeclaredMethods())
//                .filter(m -> m.getName().startsWith("test")) // reflection을 이용해서 test로 시작하는 메소드를 찾는다.
                .filter(m -> m.getAnnotation(xunit.annotation.Test.class) != null)
                .forEach(m -> {
                            try {
                                add(testClass.getConstructor(String.class).newInstance(m.getName()));
                            } catch (final Exception e) {
                                throw new RuntimeException(e);
                            }
                        }
                );
    }

    public void add(final Test test) {
        tests.add(test);
    }

    public void run(final TestResult result) {
        tests.forEach(test -> test.run(result));
    }
}
