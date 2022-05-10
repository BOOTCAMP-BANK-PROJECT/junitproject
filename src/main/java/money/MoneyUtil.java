package money;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MoneyUtil {

    private MoneyUtil() {}

    public static String format(String symbol, double money) {

        if(symbol == null) throw new IllegalArgumentException("The symbol must not be null");

        symbol = money < 0 ? "-"+symbol : symbol;

        money = money < 0 ? -money : money;

        BigDecimal rounded = BigDecimal.valueOf(money).setScale(2, RoundingMode.HALF_UP);

        return symbol + rounded;
    }

    public static String formatDollar(double money) {

        return format("$", money);
    }

    public static String formatEuro(double money) {

        return format("€", money);
    }

}
