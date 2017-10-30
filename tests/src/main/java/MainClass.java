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
        String asd = SystemProperties.key;
        String systemKey = SystemProperties.systemKey;
        System.out.println("Yigal Yigal " + asd);
        System.out.println("systemKey " + systemKey );

    }

    @Test
    @DataSet(dataSetLocation = "src/test/resources/foo.xml", myName = "Yigal")
    public void showDemo() {
        Assert.assertTrue(true);
    }
}
