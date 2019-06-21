import Tests.TemperatureConverter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TemperatureConverterTest {
    TemperatureConverter t;

    @Before
    public void init() {
        t = new TemperatureConverter();
    }

    @Test
    public void testConvertKtoC() {
        double res = t.convertKtoC(100);
        Assert.assertEquals(-173.1, res, 0.1);
    }

    @Test
    public void testConvertCtoF() {
        double res = t.convertCtoF(100);
        Assert.assertEquals(212, res, 0.1);
    }

    @Test
    public void testConvertCtoK() {
        double res = t.convertCtoK(100);
        Assert.assertEquals(373.15, res, 0.1);
    }

    @Test
    public void testConvertFtoK() {
        double res = t.convertFtoK(100);
        Assert.assertEquals(310.928, res, 0.1);
    }

    @Test
    public void testConvertKtoF() {
        double res = t.convertKtoF(100);
        Assert.assertEquals(-279.67, res, 0.1);
    }

    @Test
    public void testConvertFtoC() {
        double res = t.convertFtoC(100);
        Assert.assertEquals(37.7778, res, 0.1);
    }
}
