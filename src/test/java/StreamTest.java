import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StreamTest {
    @Test
    public void test(){
        StreamDemo demo=new StreamDemo();

        Assert.assertEquals(4,demo.findAnyMethod(Arrays.asList(10,12,13,45,25,87,57,35,53)));
    }
}
