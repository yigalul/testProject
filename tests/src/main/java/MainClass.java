import listeners.DataSet;
import listeners.DataSetListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import system_properties.SystemProperties;

@Listeners(DataSetListener.class)
public class MainClass {
    @Test
    public void firstTestCase()
    {
        String asd = SystemProperties.asd;
        System.out.println("Yigal Yigal " + asd);
        System.out.println("im in first test case from demoOne Class");

    }

    @Test
    @DataSet(dataSetLocation = "src/test/resources/foo.xml", myName = "Yigal")
    public void showDemo() {
        Assert.assertTrue(true);
    }
}
