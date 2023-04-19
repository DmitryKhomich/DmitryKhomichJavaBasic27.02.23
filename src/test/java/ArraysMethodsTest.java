import hw18UnitTesting.ArraysMethods;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArraysMethodsTest {
    protected ArraysMethods arraysMethods;

    @Before
    public void setUp(){
    arraysMethods = new ArraysMethods();
    arraysMethods.setSecondArray(new int[][]{{1, 2, 3}, {4, 5, 6}, {10, 14, 15}});
    arraysMethods.setArray(new int[]{1,4,6,8,12,55,77});
    }

    @Test
    public void isSquareMatriceTest(){
        Assert.assertTrue(arraysMethods.isSquareMatrice(arraysMethods.getSecondArray()));
    }

    @Test
    public void averageTest(){
        Assert.assertNotEquals(0,arraysMethods.average(arraysMethods.getArray()));
    }
}
