package listeners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class DataSetListener implements IInvokedMethodListener {

    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        if (!method.isTestMethod()) {
            return;
        }
        DataSet set = method.getTestMethod().getConstructorOrMethod().getMethod().getAnnotation(DataSet.class);
        if (set == null) {
            return;
        }
        System.out.println("Data Set Location : [" + set.dataSetLocation() + "]");
        System.out.println("Whats my name? " + set.myName());

    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {

    }
}
