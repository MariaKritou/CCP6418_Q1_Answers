import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

// no need to modify this class

public class Main {

    public static void main(String[] args) {
        Result r = JUnitCore.runClasses(LineTest.class);

        for(Failure f: r.getFailures())
            System.out.println(f.toString());

        System.out.println("Running test cases finished!");
    }
}
