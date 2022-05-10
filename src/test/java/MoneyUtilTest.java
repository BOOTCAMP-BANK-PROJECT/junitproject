import org.junit.Assert;
import org.junit.Test;

public class MoneyUtilTest {

    @Test
    public void moneyTest() {
        String actual = MoneyUtil.format("$", 1000);
        String expected = "$1000.00";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void negativeMoneyTest() {
        String actual = MoneyUtil.format("$", -1000);
        String expected = "-$1000.00";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dollarMoneyTest() {
        String actual = MoneyUtil.formatDollar(1230.055);
        String expected = "$1230.06";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dollarNegativeMoneyTest() {
        String actual = MoneyUtil.formatDollar(-350.353);
        String expected = "-$350.35";

        Assert.assertEquals(expected, actual);
    }

}
