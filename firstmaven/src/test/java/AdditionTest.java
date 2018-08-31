import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by expert on 7/24/18.
 */
public class AdditionTest {
    Addition obj=new Addition();

    @Test
    public void testadd(){
        Assert.assertEquals(7,obj.add(4,3));

    }
    @Before
    public void init(){
        obj=new Addition();
        System.out.println("aa");
    }
}
